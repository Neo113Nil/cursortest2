package com.goldenboot.saga.zone;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u00060\u0002j\u0002`\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/goldenboot/saga/zone/DialogInteractor;", "Lcom/goldenboot/saga/zone/ServerRollback;", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Lcom/goldenboot/saga/zone/WatcherDelta;", "annotatedString", "Lcom/goldenboot/saga/zone/DpadBuilder;", "detachStream", "(Lcom/goldenboot/saga/zone/WatcherDelta;)V", "getText", "()Lcom/goldenboot/saga/zone/WatcherDelta;", "", "injectMetric", "()Z", "Lcom/goldenboot/saga/zone/ChannelGovernor;", "growPayload", "()Lcom/goldenboot/saga/zone/ChannelGovernor;", "clipEntry", "releaseHeader", "(Lcom/goldenboot/saga/zone/ChannelGovernor;)V", "evictLayout", "Landroid/content/ClipboardManager;", "Landroidx/compose/ui/platform/NativeClipboard;", "()Landroid/content/ClipboardManager;", "nativeClipboard", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DialogInteractor implements ServerRollback {
    public static final int growPayload = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final ClipboardManager clipboardManager;

    public DialogInteractor(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    @Override // com.goldenboot.saga.zone.ServerRollback
    public void detachStream(WatcherDelta annotatedString) {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", SharedCreator.growPayload(annotatedString)));
    }

    @Override // com.goldenboot.saga.zone.ServerRollback
    /* renamed from: evictLayout, reason: from getter */
    public ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // com.goldenboot.saga.zone.ServerRollback
    public WatcherDelta getText() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return SharedCreator.evictLayout(itemAt != null ? itemAt.getText() : null);
    }

    @Override // com.goldenboot.saga.zone.ServerRollback
    public ChannelGovernor growPayload() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        if (primaryClip != null) {
            return new ChannelGovernor(primaryClip);
        }
        return null;
    }

    @Override // com.goldenboot.saga.zone.ServerRollback
    public boolean injectMetric() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // com.goldenboot.saga.zone.ServerRollback
    public void releaseHeader(ChannelGovernor clipEntry) {
        if (clipEntry == null) {
            ApplicationMux.evictLayout(this.clipboardManager);
        } else {
            this.clipboardManager.setPrimaryClip(clipEntry.getClipData());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInteractor(Context context) {
        this((ClipboardManager) r2);
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
    }
}
