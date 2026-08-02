package A5;

import We.z;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Closeable;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import n5.EnumC8444d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import v5.ViewOnAttachStateChangeListenerC10247u;
import w5.AbstractC10429a;
import w5.EnumC10434f;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Bitmap.Config[] f427a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Bitmap.Config f428b = Bitmap.Config.HARDWARE;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final z f429c = new z.a().e();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f430d = 0;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f431a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f432b;

        static {
            int[] iArr = new int[EnumC8444d.values().length];
            try {
                iArr[EnumC8444d.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8444d.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8444d.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8444d.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f431a = iArr2;
            int[] iArr3 = new int[EnumC10434f.values().length];
            try {
                iArr3[EnumC10434f.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC10434f.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f432b = iArr3;
        }
    }

    public static final void a(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final Bitmap.Config b() {
        return f428b;
    }

    public static final String c(@NotNull MimeTypeMap mimeTypeMap, String str) {
        if (str == null || kotlin.text.h.K(str)) {
            return null;
        }
        String n02 = kotlin.text.h.n0('#', str, str);
        String n03 = kotlin.text.h.n0('?', n02, n02);
        return mimeTypeMap.getMimeTypeFromExtension(kotlin.text.h.j0('.', kotlin.text.h.j0('/', n03, n03), ""));
    }

    @NotNull
    public static final ViewOnAttachStateChangeListenerC10247u d(@NotNull View view) {
        ViewOnAttachStateChangeListenerC10247u viewOnAttachStateChangeListenerC10247u;
        Object tag = view.getTag(R.id.coil_request_manager);
        ViewOnAttachStateChangeListenerC10247u viewOnAttachStateChangeListenerC10247u2 = tag instanceof ViewOnAttachStateChangeListenerC10247u ? (ViewOnAttachStateChangeListenerC10247u) tag : null;
        if (viewOnAttachStateChangeListenerC10247u2 != null) {
            return viewOnAttachStateChangeListenerC10247u2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil_request_manager);
                viewOnAttachStateChangeListenerC10247u = tag2 instanceof ViewOnAttachStateChangeListenerC10247u ? (ViewOnAttachStateChangeListenerC10247u) tag2 : null;
                if (viewOnAttachStateChangeListenerC10247u == null) {
                    viewOnAttachStateChangeListenerC10247u = new ViewOnAttachStateChangeListenerC10247u(view);
                    view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC10247u);
                    view.setTag(R.id.coil_request_manager, viewOnAttachStateChangeListenerC10247u);
                }
            } finally {
            }
        }
        return viewOnAttachStateChangeListenerC10247u;
    }

    @NotNull
    public static final Bitmap.Config[] e() {
        return f427a;
    }

    public static final boolean f(@NotNull Uri uri) {
        return Intrinsics.d(uri.getScheme(), "file") && Intrinsics.d((String) C7714v.M(uri.getPathSegments()), "android_asset");
    }

    @NotNull
    public static final z g(z zVar) {
        return zVar == null ? f429c : zVar;
    }

    public static final int h(@NotNull AbstractC10429a abstractC10429a, @NotNull EnumC10434f enumC10434f) {
        if (abstractC10429a instanceof AbstractC10429a.C2245a) {
            return ((AbstractC10429a.C2245a) abstractC10429a).f103575a;
        }
        int i11 = a.f432b[enumC10434f.ordinal()];
        if (i11 == 1) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        if (i11 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new Sc.o();
    }
}
