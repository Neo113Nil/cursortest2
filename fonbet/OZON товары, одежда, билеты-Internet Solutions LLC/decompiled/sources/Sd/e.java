package Sd;

import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes10.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26139a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26139a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(String str) {
        k kVar = k.BEGINNING;
        int i11 = 0;
        while (true) {
            if (i11 < str.length()) {
                char charAt = str.charAt(i11);
                int i12 = a.f26139a[kVar.ordinal()];
                if (i12 == 1 || i12 == 2) {
                    if (!Character.isJavaIdentifierStart(charAt)) {
                        break;
                    }
                    kVar = k.MIDDLE;
                    i11++;
                } else {
                    if (i12 != 3) {
                        throw new o();
                    }
                    if (charAt == '.') {
                        kVar = k.AFTER_DOT;
                    } else if (!Character.isJavaIdentifierPart(charAt)) {
                        break;
                    }
                    i11++;
                }
            } else if (kVar != k.AFTER_DOT) {
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r0.charAt(r2.length()) == '.') goto L12;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c b(@NotNull c cVar, @NotNull c packageName) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "prefix");
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (!Intrinsics.d(cVar, packageName) && !packageName.d()) {
            String b11 = cVar.b();
            Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
            String b12 = packageName.b();
            Intrinsics.checkNotNullExpressionValue(b12, "asString(...)");
            if (kotlin.text.h.e0(b11, b12, false)) {
            }
            return cVar;
        }
        if (!packageName.d()) {
            if (cVar.equals(packageName)) {
                c ROOT = c.f26129c;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                return ROOT;
            }
            String b13 = cVar.b();
            Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
            String substring = b13.substring(packageName.b().length() + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return new c(substring);
        }
        return cVar;
    }
}
