package com.google.mlkit.common.sdkinternal;

/* loaded from: classes.dex */
public abstract class MLTask<T, S extends com.google.mlkit.common.sdkinternal.MLTaskInput> extends com.google.mlkit.common.sdkinternal.ModelResource {
    public MLTask() {
    }

    public abstract T run(S s) throws com.google.mlkit.common.MlKitException;

    protected MLTask(com.google.mlkit.common.sdkinternal.TaskQueue taskQueue) {
        super(taskQueue);
    }
}
