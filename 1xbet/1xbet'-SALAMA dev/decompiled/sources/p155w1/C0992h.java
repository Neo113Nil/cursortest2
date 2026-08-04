package p155w1;

import java.util.Calendar;

/* JADX INFO: renamed from: w1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0992h extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17727a;

    public C0992h(int i7) {
        this.f17727a = i7;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        int i7 = this.f17727a;
        if (i7 <= 0 || i7 >= 110) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) i7) * 31449600000L);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i8 = calendar.get(1);
        calendar.clear();
        calendar.set(1, i8);
        long timeInMillis = calendar.getTimeInMillis();
        if (timeInMillis <= 0) {
            AbstractC0997i0.o(2, "Birth date is invalid, do not send the frame.");
        } else {
            C1050x1.z().A(new R1(new S1(Long.valueOf(timeInMillis), 0), 0));
        }
    }
}
