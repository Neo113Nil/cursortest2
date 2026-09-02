package com.goldenboot.saga.zone;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class BorderList {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final /* synthetic */ class ActivityMutator extends FunctionReferenceImpl implements TouchRecord {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final CompatCache evictLayout(View view) {
        return PaddingStage.applyTask(view.getParent(), ActivityMutator.reduceScope);
    }
}
