package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShopItemPresentationModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/model/remote/entity/shop/ShopPresentationMode;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "NATIVE", "HTML_INLINE", "HTML_REMOTE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShopPresentationMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShopPresentationMode[] $VALUES;

    @SerializedName("NATIVE")
    public static final ShopPresentationMode NATIVE = new ShopPresentationMode("NATIVE", 0);

    @SerializedName("HTML_INLINE")
    public static final ShopPresentationMode HTML_INLINE = new ShopPresentationMode("HTML_INLINE", 1);

    @SerializedName("HTML_REMOTE")
    public static final ShopPresentationMode HTML_REMOTE = new ShopPresentationMode("HTML_REMOTE", 2);

    private static final /* synthetic */ ShopPresentationMode[] $values() {
        return new ShopPresentationMode[]{NATIVE, HTML_INLINE, HTML_REMOTE};
    }

    public static EnumEntries<ShopPresentationMode> getEntries() {
        return $ENTRIES;
    }

    private ShopPresentationMode(String str, int i) {
    }

    static {
        ShopPresentationMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ShopPresentationMode valueOf(String str) {
        return (ShopPresentationMode) Enum.valueOf(ShopPresentationMode.class, str);
    }

    public static ShopPresentationMode[] values() {
        return (ShopPresentationMode[]) $VALUES.clone();
    }
}
