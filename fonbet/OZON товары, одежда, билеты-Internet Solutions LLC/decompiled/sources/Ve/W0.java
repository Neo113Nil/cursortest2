package Ve;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* loaded from: classes10.dex */
public final class W0 extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1 f30235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30237c;

    public W0(C1 c12, int i11, String str) {
        this.f30235a = c12;
        this.f30236b = i11;
        this.f30237c = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        ((C4092a9) this.f30235a.u()).e0(new Kg(this.f30236b, this.f30237c));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        int i11 = R.color.spay_main_bank_green_color;
        C1 c12 = this.f30235a;
        Intrinsics.checkNotNullParameter(c12, "<this>");
        ds.setColor(androidx.core.content.res.g.b(c12.getResources(), i11, null));
        ds.setUnderlineText(false);
    }
}
