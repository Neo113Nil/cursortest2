package H;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes8.dex */
final class i implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f10351b;

    /* renamed from: a, reason: collision with root package name */
    final ArrayDeque f10350a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final b f10352c = new b();

    /* renamed from: d, reason: collision with root package name */
    c f10353d = c.IDLE;

    /* renamed from: e, reason: collision with root package name */
    long f10354e = 0;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f10355a;

        a(Runnable runnable) {
            this.f10355a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10355a.run();
        }
    }

    final class b implements Runnable {
        b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            C.S.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a() {
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                try {
                    synchronized (i.this.f10350a) {
                        if (!z11) {
                            i iVar = i.this;
                            c cVar = iVar.f10353d;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                iVar.f10354e++;
                                iVar.f10353d = cVar2;
                                z11 = true;
                            }
                        }
                        Runnable runnable = (Runnable) i.this.f10350a.poll();
                        if (runnable == null) {
                            i.this.f10353d = c.IDLE;
                        }
                    }
                    if (!z12) {
                        return;
                    }
                } finally {
                    if (z12) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e11) {
                synchronized (i.this.f10350a) {
                    i.this.f10353d = c.IDLE;
                    throw e11;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c IDLE;
        public static final c QUEUED;
        public static final c QUEUING;
        public static final c RUNNING;

        static {
            c cVar = new c("IDLE", 0);
            IDLE = cVar;
            c cVar2 = new c("QUEUING", 1);
            QUEUING = cVar2;
            c cVar3 = new c("QUEUED", 2);
            QUEUED = cVar3;
            c cVar4 = new c("RUNNING", 3);
            RUNNING = cVar4;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    i(Executor executor) {
        executor.getClass();
        this.f10351b = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        c cVar;
        boolean z11;
        runnable.getClass();
        synchronized (this.f10350a) {
            c cVar2 = this.f10353d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j11 = this.f10354e;
                a aVar = new a(runnable);
                this.f10350a.add(aVar);
                c cVar3 = c.QUEUING;
                this.f10353d = cVar3;
                try {
                    this.f10351b.execute(this.f10352c);
                    if (this.f10353d != cVar3) {
                        return;
                    }
                    synchronized (this.f10350a) {
                        try {
                            if (this.f10354e == j11 && this.f10353d == cVar3) {
                                this.f10353d = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e11) {
                    synchronized (this.f10350a) {
                        try {
                            c cVar4 = this.f10353d;
                            if (cVar4 != c.IDLE) {
                                if (cVar4 == c.QUEUING) {
                                }
                                z11 = false;
                                if ((e11 instanceof RejectedExecutionException) || z11) {
                                    throw e11;
                                }
                            }
                            if (this.f10350a.removeLastOccurrence(aVar)) {
                                z11 = true;
                                if (e11 instanceof RejectedExecutionException) {
                                }
                                throw e11;
                            }
                            z11 = false;
                            if (e11 instanceof RejectedExecutionException) {
                            }
                            throw e11;
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f10350a.add(runnable);
        }
    }
}
