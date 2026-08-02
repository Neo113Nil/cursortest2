package w1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p.C1524k;
import p.C1525l;

/* renamed from: w1.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1695f1 extends AbstractC1765z1 {

    /* renamed from: B, reason: collision with root package name */
    public static final C1695f1 f17709B = new C1695f1();

    /* renamed from: A, reason: collision with root package name */
    public final B f17710A;

    /* renamed from: z, reason: collision with root package name */
    public I4.j f17711z;

    public C1695f1() {
        super(AbstractC1753v1.a(EnumC1747t1.f17869x), false);
        this.f17710A = new B(this, 8);
    }

    public static void h(u1.c cVar) {
        Context context = AbstractC1707i1.f17743c;
        boolean f7 = AbstractC1715k1.f(context);
        Uri uri = (Uri) cVar.f16591b;
        if (!f7) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            context.startActivity(intent);
            return;
        }
        C1524k c1524k = new C1524k();
        c1524k.f15643a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        C1525l a2 = c1524k.a();
        Uri parse = Uri.parse(uri.toString());
        if (!AbstractC1715k1.f(context)) {
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            intent2.setFlags(268435456);
            context.startActivity(intent2);
            return;
        }
        Uri parse2 = Uri.parse("2//" + context.getPackageName());
        Intent intent3 = a2.f15650a;
        intent3.putExtra("android.intent.extra.REFERRER", parse2);
        String b7 = AbstractC1706i0.b(context);
        intent3.setFlags(268435456);
        intent3.setPackage(b7);
        a2.a(context, parse);
    }
}
