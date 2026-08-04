package G4;

import java.util.PriorityQueue;

/* JADX INFO: renamed from: G4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0284q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0269b f3014c = new C0269b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3016b;

    public void a(Long l7) {
        PriorityQueue priorityQueue = (PriorityQueue) this.f3016b;
        if (priorityQueue.size() < this.f3015a) {
            priorityQueue.add(l7);
            return;
        }
        if (l7.longValue() < ((Long) priorityQueue.peek()).longValue()) {
            priorityQueue.poll();
            priorityQueue.add(l7);
        }
    }
}
