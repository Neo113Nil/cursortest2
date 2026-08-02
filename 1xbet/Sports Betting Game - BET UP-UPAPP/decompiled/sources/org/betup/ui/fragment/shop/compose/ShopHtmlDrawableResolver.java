package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Log;
import androidx.appcompat.content.res.AppCompatResources;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopHtmlDrawableResolver.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopHtmlDrawableResolver;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "resolveShopIconUrl", "", "context", "Landroid/content/Context;", "imgUrl", "drawableNameToDataUrl", "name", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopHtmlDrawableResolver {
    public static final int $stable = 0;
    public static final ShopHtmlDrawableResolver INSTANCE = new ShopHtmlDrawableResolver();

    private ShopHtmlDrawableResolver() {
    }

    public final String resolveShopIconUrl(Context context, String imgUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        if (StringsKt.isBlank(imgUrl)) {
            return null;
        }
        if (!StringsKt.startsWith$default(imgUrl, "drawable://", false, 2, (Object) null)) {
            return imgUrl;
        }
        String removePrefix = StringsKt.removePrefix(imgUrl, (CharSequence) "drawable://");
        if (StringsKt.isBlank(removePrefix)) {
            return null;
        }
        return drawableNameToDataUrl(context, removePrefix);
    }

    private final String drawableNameToDataUrl(Context context, String name) {
        int identifier = context.getResources().getIdentifier(name, "drawable", context.getPackageName());
        if (identifier == 0) {
            Log.w("ShopHtmlDrawableResolver", "Drawable not found: " + name);
            return null;
        }
        Drawable drawable = AppCompatResources.getDrawable(context, identifier);
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() > 0 ? drawable.getIntrinsicWidth() : 192;
        int intrinsicHeight = drawable.getIntrinsicHeight() > 0 ? drawable.getIntrinsicHeight() : 192;
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return "data:image/png;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }
}
