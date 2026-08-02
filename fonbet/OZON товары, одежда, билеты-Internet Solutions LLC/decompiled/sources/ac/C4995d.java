package ac;

import Hf.AbstractC3138a;
import Hf.t;
import Hf.u;
import Hf.w;
import Hf.z;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ac.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C4995d implements If.d {

    /* renamed from: ac.d$a */
    private static class a extends AbstractC3138a {

        /* renamed from: a, reason: collision with root package name */
        private static final Pattern f36548a = Pattern.compile("^\\[([xX\\s])]\\s+(.*)");

        @Override // Hf.AbstractC3138a, Hf.B
        public final void C(t tVar) {
            u c11 = tVar.c();
            if (c11 instanceof w) {
                u c12 = c11.c();
                if (c12 instanceof z) {
                    Matcher matcher = f36548a.matcher(((z) c12).m());
                    if (matcher.matches()) {
                        boolean z11 = true;
                        String group = matcher.group(1);
                        if (!"x".equals(group) && !"X".equals(group)) {
                            z11 = false;
                        }
                        C4993b c4993b = new C4993b(z11);
                        w wVar = new w();
                        tVar.i(c4993b);
                        String group2 = matcher.group(2);
                        if (!TextUtils.isEmpty(group2)) {
                            wVar.b(new z(group2));
                        }
                        u e11 = c12.e();
                        while (e11 != null) {
                            u e12 = e11.e();
                            wVar.b(e11);
                            e11 = e12;
                        }
                        c4993b.b(wVar);
                        u e13 = c11.e();
                        while (e13 != null) {
                            u e14 = e13.e();
                            c4993b.b(e13);
                            e13 = e14;
                        }
                        tVar.l();
                        b(c4993b);
                        return;
                    }
                }
            }
            b(tVar);
        }
    }

    @Override // If.d
    public final u a(u uVar) {
        uVar.a(new a());
        return uVar;
    }
}
