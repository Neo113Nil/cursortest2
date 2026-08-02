package Ve;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* loaded from: classes10.dex */
public final class Bl extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4192dm f28719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28721c;

    public Bl(C4192dm c4192dm, int i11, String str) {
        this.f28719a = c4192dm;
        this.f28720b = i11;
        this.f28721c = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        ((D1) this.f28719a.u()).e0(new C4566ql(this.f28720b, this.f28721c));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        int i11 = R.color.spay_main_bank_green_color;
        C4192dm c4192dm = this.f28719a;
        Intrinsics.checkNotNullParameter(c4192dm, "<this>");
        ds.setColor(androidx.core.content.res.g.b(c4192dm.getResources(), i11, null));
        ds.setUnderlineText(false);
    }
}
