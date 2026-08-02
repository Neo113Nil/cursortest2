package w1;

import java.util.Calendar;

/* renamed from: w1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1701h extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17721a;

    public C1701h(int i7) {
        this.f17721a = i7;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        int i7 = this.f17721a;
        if (i7 <= 0 || i7 >= 110) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - (i7 * 31449600000L);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i8 = calendar.get(1);
        calendar.clear();
        calendar.set(1, i8);
        long timeInMillis = calendar.getTimeInMillis();
        if (timeInMillis <= 0) {
            AbstractC1706i0.o(2, "Birth date is invalid, do not send the frame.");
        } else {
            C1759x1.z().A(new R1(new S1(Long.valueOf(timeInMillis), 0), 0));
        }
    }
}
