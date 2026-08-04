package p155w1;

import android.os.FileObserver;
import com.flurry.android.marketing.messaging.notification.b;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import p031e1.k;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class E2 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1047w1 f17371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17372b;

    public E2(File file, C1047w1 c1047w1) {
        super(file);
        this.f17372b = file.getAbsolutePath();
        this.f17371a = c1047w1;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i7, String str) {
        List listAsList;
        if (str == null || (i7 & 8) == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17372b);
        sb.append("/");
        sb.append(str);
        sb.append(" is written and closed\n");
        C1047w1 c1047w1 = this.f17371a;
        c1047w1.getClass();
        File file = new File(k.i(e.c(AbstractC1006k1.h()), File.separator, str));
        if (!file.exists() || (listAsList = Arrays.asList(file)) == null || listAsList.size() == 0) {
            return;
        }
        c1047w1.d(new b(22, c1047w1, listAsList));
    }
}
