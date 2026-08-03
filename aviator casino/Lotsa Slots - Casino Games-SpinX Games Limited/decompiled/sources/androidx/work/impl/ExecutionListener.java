package androidx.work.impl;

/* loaded from: classes2.dex */
public interface ExecutionListener {
    void onExecuted(androidx.work.impl.model.WorkGenerationalId id, boolean needsReschedule);
}
