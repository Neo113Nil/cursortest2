package com.goldenboot.saga.zone;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.goldenboot.saga.zone.LegacyDelegate;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ColorRecord {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class ActivityMutator extends InputConnectionWrapper {
        public final /* synthetic */ BounceHandler evictLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(InputConnection inputConnection, boolean z, BounceHandler bounceHandler) {
            super(inputConnection, z);
            this.evictLayout = bounceHandler;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.evictLayout.evictLayout(CanvasRollback.clipOrigin(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public interface BounceHandler {
        boolean evictLayout(CanvasRollback canvasRollback, int i, Bundle bundle);
    }

    public static InputConnection detachStream(InputConnection inputConnection, EditorInfo editorInfo, BounceHandler bounceHandler) {
        ModuleAdministrator.injectMetric(inputConnection, "inputConnection must be non-null");
        ModuleAdministrator.injectMetric(editorInfo, "editorInfo must be non-null");
        ModuleAdministrator.injectMetric(bounceHandler, "onCommitContentListener must be non-null");
        return new ActivityMutator(inputConnection, false, bounceHandler);
    }

    public static /* synthetic */ boolean evictLayout(View view, CanvasRollback canvasRollback, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                canvasRollback.detachStream();
                Parcelable parcelable = (Parcelable) canvasRollback.releaseHeader();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        return ItemFacilitator.resumeSignature(view, new LegacyDelegate.ActivityMutator(new ClipData(canvasRollback.growPayload(), new ClipData.Item(canvasRollback.evictLayout())), 2).detachStream(canvasRollback.injectMetric()).growPayload(bundle).evictLayout()) == null;
    }

    public static BounceHandler growPayload(final View view) {
        GroupBroadcaster.flushSample(view);
        return new BounceHandler() { // from class: com.goldenboot.saga.zone.EmitterAggregator
            @Override // com.goldenboot.saga.zone.ColorRecord.BounceHandler
            public final boolean evictLayout(CanvasRollback canvasRollback, int i, Bundle bundle) {
                return ColorRecord.evictLayout(view, canvasRollback, i, bundle);
            }
        };
    }

    public static InputConnection injectMetric(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return detachStream(inputConnection, editorInfo, growPayload(view));
    }
}
