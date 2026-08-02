package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.betup.model.remote.entity.shop.ShopDisplaySection;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopHtmlTemplateLoader.kt */
@Deprecated(message = "Shop HTML is loaded from API presentation fields, not local assets")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopHtmlTemplateLoader;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "DEFAULT_TEMPLATE", "", "loadTemplate", "context", "Landroid/content/Context;", "section", "Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "readAsset", "path", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopHtmlTemplateLoader {
    public static final int $stable = 0;
    private static final String DEFAULT_TEMPLATE = "shop/shop_item_card.html";
    public static final ShopHtmlTemplateLoader INSTANCE = new ShopHtmlTemplateLoader();

    private ShopHtmlTemplateLoader() {
    }

    public final String loadTemplate(Context context, ShopDisplaySection section) {
        String str;
        Object m10853constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        if (section != null) {
            String lowerCase = section.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str = "shop/shop_" + lowerCase + ".html";
        } else {
            str = null;
        }
        if (str != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                ShopHtmlTemplateLoader shopHtmlTemplateLoader = this;
                m10853constructorimpl = Result.m10853constructorimpl(readAsset(context, str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
            }
            String str2 = (String) (Result.m10859isFailureimpl(m10853constructorimpl) ? null : m10853constructorimpl);
            if (str2 != null) {
                return str2;
            }
        }
        return readAsset(context, DEFAULT_TEMPLATE);
    }

    private final String readAsset(Context context, String path) {
        InputStream open = context.getAssets().open(path);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String readText = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            return readText;
        } finally {
        }
    }
}
