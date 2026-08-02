package Lj;

import Kj.c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface a extends Lj.b<Drawable> {

    /* renamed from: Lj.a$a, reason: collision with other inner class name */
    public static final class C0332a {
        @NotNull
        public static a a(@NotNull Resources resources, int i11) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            String resourceName = resources.getResourceName(i11);
            Intrinsics.checkNotNullExpressionValue(resourceName, "getResourceName(...)");
            return new b(resourceName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17091a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f17092b;

        public b(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            this.f17091a = token;
            boolean z11 = false;
            if (token != null && (h.t(token, "_multicolor_", false) || h.t(token, "_flag_", false))) {
                z11 = true;
            }
            this.f17092b = z11;
        }

        public final Drawable a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            int i11 = c.f15997c;
            Intrinsics.checkNotNullParameter(context, "<this>");
            String name = this.f17091a;
            Intrinsics.checkNotNullParameter(name, "name");
            int identifier = context.getResources().getIdentifier(name, "drawable", context.getApplicationContext().getPackageName());
            Integer valueOf = identifier != 0 ? Integer.valueOf(identifier) : null;
            if (valueOf != null) {
                return androidx.core.content.a.getDrawable(context, valueOf.intValue());
            }
            return null;
        }

        @Override // Lj.a
        public final boolean isMulticolor() {
            return this.f17092b;
        }
    }

    boolean isMulticolor();
}
