package p155w1;

import I4.j;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p109p.k;
import p109p.l;
import p145u1.c;

/* JADX INFO: renamed from: w1.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0986f1 extends AbstractC1056z1 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0986f1 f17715B = new C0986f1();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final B f17716A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j f17717z;

    public C0986f1() {
        super(AbstractC1044v1.a(EnumC1038t1.f17875x), false);
        this.f17716A = new B(this, 8);
    }

    public static void h(c cVar) {
        Context context = AbstractC0998i1.f17749c;
        boolean zF = AbstractC1006k1.f(context);
        Uri uri = (Uri) cVar.f16597b;
        if (!zF) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            context.startActivity(intent);
            return;
        }
        k kVar = new k();
        kVar.f15649a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        l lVarA = kVar.a();
        Uri uri2 = Uri.parse(uri.toString());
        if (!AbstractC1006k1.f(context)) {
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            intent2.setFlags(268435456);
            context.startActivity(intent2);
            return;
        }
        Uri uri3 = Uri.parse("2//" + context.getPackageName());
        Intent intent3 = lVarA.f15656a;
        intent3.putExtra("android.intent.extra.REFERRER", uri3);
        String strB = AbstractC0997i0.b(context);
        intent3.setFlags(268435456);
        intent3.setPackage(strB);
        lVarA.a(context, uri2);
    }
}
