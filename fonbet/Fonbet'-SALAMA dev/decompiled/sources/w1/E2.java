package w1;

import android.os.FileObserver;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class E2 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public C1756w1 f17365a;

    /* renamed from: b, reason: collision with root package name */
    public String f17366b;

    public E2(File file, C1756w1 c1756w1) {
        super(file);
        this.f17366b = file.getAbsolutePath();
        this.f17365a = c1756w1;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i7, String str) {
        List asList;
        if (str == null || (i7 & 8) == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17366b);
        sb.append("/");
        sb.append(str);
        sb.append(" is written and closed\n");
        C1756w1 c1756w1 = this.f17365a;
        c1756w1.getClass();
        File file = new File(e1.k.i(t.e.c(AbstractC1715k1.h()), File.separator, str));
        if (!file.exists() || (asList = Arrays.asList(file)) == null || asList.size() == 0) {
            return;
        }
        c1756w1.d(new com.flurry.android.marketing.messaging.notification.b(22, c1756w1, asList));
    }
}
