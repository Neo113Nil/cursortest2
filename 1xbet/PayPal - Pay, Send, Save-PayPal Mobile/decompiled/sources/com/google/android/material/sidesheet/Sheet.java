package com.google.android.material.sidesheet;

/* loaded from: classes8.dex */
interface Sheet<C extends com.google.android.material.sidesheet.SheetCallback> extends com.google.android.material.motion.MaterialBackHandler {
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 0;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SheetEdge {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SheetState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface StableSheetState {
    }

    void addCallback(C c);

    int getState();

    void removeCallback(C c);

    void setState(int i);
}
