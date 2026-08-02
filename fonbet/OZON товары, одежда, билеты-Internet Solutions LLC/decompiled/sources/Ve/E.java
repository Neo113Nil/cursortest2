package Ve;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class E {
    public static final int a(int i11, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    public static int b(Resources resources, int i11) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return resources.getColor(i11, null);
    }

    public static final Pq d(int i11) {
        return new Pq(i11, kotlin.collections.K.f71697a);
    }

    public static final String e() {
        Intrinsics.checkNotNullParameter(Wk.f30289a, "<this>");
        switch (Em.a(Wk.f30290b)) {
            case 0:
                return "PROD";
            case 1:
                return "PSI";
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return "IFT";
            default:
                throw new Sc.o();
        }
    }

    public static final String f(Sr sr, Context context) {
        String string;
        Intrinsics.checkNotNullParameter(sr, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (sr instanceof C4543pr) {
            return ((C4543pr) sr).f31818a.toString();
        }
        if (!(sr instanceof Pq)) {
            throw new Sc.o();
        }
        Pq pq = (Pq) sr;
        boolean isEmpty = pq.f29741b.isEmpty();
        int i11 = pq.f29740a;
        if (isEmpty) {
            string = context.getString(i11);
        } else {
            List list = pq.f29741b;
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                if (obj instanceof Sr) {
                    obj = f((Sr) obj, context);
                }
                objArr[i12] = obj;
            }
            string = context.getString(i11, Arrays.copyOf(objArr, size));
        }
        Intrinsics.checkNotNullExpressionValue(string, "{\n        if (args.isEmp…d, *args)\n        }\n    }");
        return string;
    }

    public static final void g(androidx.fragment.app.r rVar, View view) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Object systemService = rVar.getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static int h(int i11, int i12) {
        return (i11 & 16777215) | (i12 << 24);
    }

    public abstract Pi c();
}
