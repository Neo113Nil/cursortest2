package Wg0;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f33862a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Mg0.b f33863b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33864c;

    public d(@NotNull Context context, @NotNull Mg0.b controller, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f33862a = context;
        this.f33863b = controller;
        this.f33864c = i11;
    }

    public static void a(d dVar) {
        dVar.f33863b.n();
    }

    public static void b(d dVar) {
        dVar.f33863b.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [Wg0.c] */
    @Override // Wg0.e
    @NotNull
    public final androidx.appcompat.app.f create() {
        f.a aVar = new f.a(new androidx.appcompat.view.d(this.f33862a, this.f33864c));
        aVar.e(R.string.protection_app_dialog_body);
        androidx.appcompat.app.f create = aVar.setPositiveButton(R.string.protection_app_dialog_open_settings, new DialogInterface.OnClickListener() { // from class: Wg0.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                d.b(d.this);
            }
        }).setNegativeButton(R.string.protection_app_dialog_remind_later, new b(0)).i(new DialogInterface.OnClickListener() { // from class: Wg0.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                d.a(d.this);
            }
        }).create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }
}
