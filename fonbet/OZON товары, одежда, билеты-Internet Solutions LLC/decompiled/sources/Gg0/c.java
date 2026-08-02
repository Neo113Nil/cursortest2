package Gg0;

import android.view.View;
import android.view.ViewParent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f10231a = new LinkedHashMap();

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f10232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f10233b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10234c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f10235d;

        public a(View view, c cVar, String str, View view2) {
            this.f10232a = view;
            this.f10233b = cVar;
            this.f10234c = str;
            this.f10235d = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f10232a.removeOnAttachStateChangeListener(this);
            c.a(this.f10233b, this.f10234c, this.f10235d);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036 A[LOOP:0: B:12:0x001a->B:21:0x0036, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(c cVar, String str, View view) {
        LinkedHashMap linkedHashMap = cVar.f10231a;
        Object tag = view.getTag(R.id.tag_key_widget_name);
        String str2 = null;
        String str3 = tag instanceof String ? (String) tag : null;
        if (str3 == null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    Object tag2 = view2.getTag(R.id.tag_key_widget_name);
                    if (tag2 instanceof String) {
                        str3 = (String) tag2;
                        if (str3 != null) {
                        }
                    }
                }
                str3 = null;
                if (str3 != null) {
                }
            }
            if (str2 != null) {
                return;
            }
            linkedHashMap.put(str, str2);
            return;
        }
        str2 = str3;
        if (str2 != null) {
        }
    }

    public final String b(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return (String) this.f10231a.get(uuid);
    }

    public final void c(@NotNull View view, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f10231a.containsKey(uuid)) {
            return;
        }
        if (view.isAttachedToWindow()) {
            a(this, uuid, view);
        } else {
            view.addOnAttachStateChangeListener(new a(view, this, uuid, view));
        }
    }
}
