package Ve;

import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* loaded from: classes10.dex */
public final class Yf extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4817zg f30459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30460b;

    public Yf(C4817zg c4817zg, String str) {
        this.f30459a = c4817zg;
        this.f30460b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(this.f30460b);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        intent.setData(parse);
        intent.setFlags(1073741825);
        this.f30459a.startActivity(Intent.createChooser(intent, "Open Terms of Service"));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        int i11 = R.color.spay_main_bank_green_color;
        C4817zg c4817zg = this.f30459a;
        Intrinsics.checkNotNullParameter(c4817zg, "<this>");
        ds.setColor(androidx.core.content.res.g.b(c4817zg.getResources(), i11, null));
        ds.setUnderlineText(false);
    }
}
