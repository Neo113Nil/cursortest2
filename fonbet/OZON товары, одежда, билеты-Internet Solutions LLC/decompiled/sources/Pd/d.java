package Pd;

import Nd.n;
import Nd.o;
import Sc.v;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final o f22257a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f22258b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22259a;

        static {
            int[] iArr = new int[n.c.EnumC0382c.values().length];
            try {
                iArr[n.c.EnumC0382c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.c.EnumC0382c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.c.EnumC0382c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22259a = iArr;
        }
    }

    public d(@NotNull o strings, @NotNull n qualifiedNames) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(qualifiedNames, "qualifiedNames");
        this.f22257a = strings;
        this.f22258b = qualifiedNames;
    }

    private final v<List<String>, List<String>, Boolean> c(int i11) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z11 = false;
        while (i11 != -1) {
            n.c i12 = this.f22258b.i(i11);
            String i13 = this.f22257a.i(i12.n());
            n.c.EnumC0382c l11 = i12.l();
            Intrinsics.f(l11);
            int i14 = a.f22259a[l11.ordinal()];
            if (i14 == 1) {
                linkedList2.addFirst(i13);
            } else if (i14 == 2) {
                linkedList.addFirst(i13);
            } else {
                if (i14 != 3) {
                    throw new Sc.o();
                }
                linkedList2.addFirst(i13);
                z11 = true;
            }
            i11 = i12.m();
        }
        return new v<>(linkedList, linkedList2, Boolean.valueOf(z11));
    }

    @Override // Pd.c
    @NotNull
    public final String a(int i11) {
        v<List<String>, List<String>, Boolean> c11 = c(i11);
        List<String> a11 = c11.a();
        String V11 = C7714v.V(c11.b(), ".", null, null, null, 62);
        if (a11.isEmpty()) {
            return V11;
        }
        return C7714v.V(a11, "/", null, null, null, 62) + '/' + V11;
    }

    @Override // Pd.c
    public final boolean b(int i11) {
        return c(i11).g().booleanValue();
    }

    @Override // Pd.c
    @NotNull
    public final String getString(int i11) {
        String i12 = this.f22257a.i(i11);
        Intrinsics.checkNotNullExpressionValue(i12, "getString(...)");
        return i12;
    }
}
