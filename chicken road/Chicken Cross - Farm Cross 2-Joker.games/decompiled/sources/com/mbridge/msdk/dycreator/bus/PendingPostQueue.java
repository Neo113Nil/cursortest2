package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes6.dex */
final class PendingPostQueue {

    /* renamed from: a, reason: collision with root package name */
    private PendingPost f9222a;
    private PendingPost b;

    PendingPostQueue() {
    }

    synchronized void a(PendingPost pendingPost) {
        if (pendingPost == null) {
            throw new NullPointerException("null cannot be enqueued");
        }
        PendingPost pendingPost2 = this.b;
        if (pendingPost2 != null) {
            pendingPost2.c = pendingPost;
            this.b = pendingPost;
        } else {
            if (this.f9222a != null) {
                throw new IllegalStateException("Head present, but no tail");
            }
            this.b = pendingPost;
            this.f9222a = pendingPost;
        }
        notifyAll();
    }

    synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f9222a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.c;
            this.f9222a = pendingPost2;
            if (pendingPost2 == null) {
                this.b = null;
            }
        }
        return pendingPost;
    }

    synchronized PendingPost a(int i) throws InterruptedException {
        if (this.f9222a == null) {
            wait(i);
        }
        return a();
    }
}
