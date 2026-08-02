package com.google.firebase.concurrent;

/* loaded from: classes9.dex */
public interface PausableExecutor extends java.util.concurrent.Executor {
    boolean isPaused();

    void pause();

    void resume();
}
