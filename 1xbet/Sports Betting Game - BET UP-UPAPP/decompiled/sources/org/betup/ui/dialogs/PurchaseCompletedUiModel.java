package org.betup.ui.dialogs;

import android.os.Bundle;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PurchaseCompletedUiModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00011Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\fHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00062"}, d2 = {"Lorg/betup/ui/dialogs/PurchaseCompletedUiModel;", "", "itemTitle", "", "itemIconUrl", PurchaseCompletedUiModel.ARG_KIND, "Lorg/betup/ui/dialogs/PurchaseCompletedKind;", "instantAmount", "", "bonusAmount", "dailyCoins", "packageDays", "", "totalPackageValue", "effectDescription", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/dialogs/PurchaseCompletedKind;JJJLjava/lang/Integer;JLjava/lang/String;)V", "getItemTitle", "()Ljava/lang/String;", "getItemIconUrl", "getKind", "()Lorg/betup/ui/dialogs/PurchaseCompletedKind;", "getInstantAmount", "()J", "getBonusAmount", "getDailyCoins", "getPackageDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalPackageValue", "getEffectDescription", "toBundle", "Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/dialogs/PurchaseCompletedKind;JJJLjava/lang/Integer;JLjava/lang/String;)Lorg/betup/ui/dialogs/PurchaseCompletedUiModel;", "equals", "", "other", "hashCode", "toString", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PurchaseCompletedUiModel {
    public static final int $stable = 0;
    private static final String ARG_BONUS_AMOUNT = "bonus_amount";
    private static final String ARG_DAILY_COINS = "daily_coins";
    private static final String ARG_EFFECT_DESCRIPTION = "effect_description";
    private static final String ARG_INSTANT_AMOUNT = "instant_amount";
    private static final String ARG_ITEM_ICON_URL = "item_icon_url";
    private static final String ARG_ITEM_TITLE = "item_title";
    private static final String ARG_KIND = "kind";
    private static final String ARG_PACKAGE_DAYS = "package_days";
    private static final String ARG_TOTAL_PACKAGE_VALUE = "total_package_value";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long bonusAmount;
    private final long dailyCoins;
    private final String effectDescription;
    private final long instantAmount;
    private final String itemIconUrl;
    private final String itemTitle;
    private final PurchaseCompletedKind kind;
    private final Integer packageDays;
    private final long totalPackageValue;

    public PurchaseCompletedUiModel() {
        this(null, null, null, 0L, 0L, 0L, null, 0L, null, 511, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getItemTitle() {
        return this.itemTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getItemIconUrl() {
        return this.itemIconUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final PurchaseCompletedKind getKind() {
        return this.kind;
    }

    /* renamed from: component4, reason: from getter */
    public final long getInstantAmount() {
        return this.instantAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final long getBonusAmount() {
        return this.bonusAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDailyCoins() {
        return this.dailyCoins;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getPackageDays() {
        return this.packageDays;
    }

    /* renamed from: component8, reason: from getter */
    public final long getTotalPackageValue() {
        return this.totalPackageValue;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEffectDescription() {
        return this.effectDescription;
    }

    public final PurchaseCompletedUiModel copy(String itemTitle, String itemIconUrl, PurchaseCompletedKind kind, long instantAmount, long bonusAmount, long dailyCoins, Integer packageDays, long totalPackageValue, String effectDescription) {
        Intrinsics.checkNotNullParameter(itemTitle, "itemTitle");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new PurchaseCompletedUiModel(itemTitle, itemIconUrl, kind, instantAmount, bonusAmount, dailyCoins, packageDays, totalPackageValue, effectDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseCompletedUiModel)) {
            return false;
        }
        PurchaseCompletedUiModel purchaseCompletedUiModel = (PurchaseCompletedUiModel) other;
        return Intrinsics.areEqual(this.itemTitle, purchaseCompletedUiModel.itemTitle) && Intrinsics.areEqual(this.itemIconUrl, purchaseCompletedUiModel.itemIconUrl) && this.kind == purchaseCompletedUiModel.kind && this.instantAmount == purchaseCompletedUiModel.instantAmount && this.bonusAmount == purchaseCompletedUiModel.bonusAmount && this.dailyCoins == purchaseCompletedUiModel.dailyCoins && Intrinsics.areEqual(this.packageDays, purchaseCompletedUiModel.packageDays) && this.totalPackageValue == purchaseCompletedUiModel.totalPackageValue && Intrinsics.areEqual(this.effectDescription, purchaseCompletedUiModel.effectDescription);
    }

    public int hashCode() {
        int hashCode = this.itemTitle.hashCode() * 31;
        String str = this.itemIconUrl;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.kind.hashCode()) * 31) + Long.hashCode(this.instantAmount)) * 31) + Long.hashCode(this.bonusAmount)) * 31) + Long.hashCode(this.dailyCoins)) * 31;
        Integer num = this.packageDays;
        int hashCode3 = (((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Long.hashCode(this.totalPackageValue)) * 31;
        String str2 = this.effectDescription;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseCompletedUiModel(itemTitle=" + this.itemTitle + ", itemIconUrl=" + this.itemIconUrl + ", kind=" + this.kind + ", instantAmount=" + this.instantAmount + ", bonusAmount=" + this.bonusAmount + ", dailyCoins=" + this.dailyCoins + ", packageDays=" + this.packageDays + ", totalPackageValue=" + this.totalPackageValue + ", effectDescription=" + this.effectDescription + ")";
    }

    public PurchaseCompletedUiModel(String itemTitle, String str, PurchaseCompletedKind kind, long j, long j2, long j3, Integer num, long j4, String str2) {
        Intrinsics.checkNotNullParameter(itemTitle, "itemTitle");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.itemTitle = itemTitle;
        this.itemIconUrl = str;
        this.kind = kind;
        this.instantAmount = j;
        this.bonusAmount = j2;
        this.dailyCoins = j3;
        this.packageDays = num;
        this.totalPackageValue = j4;
        this.effectDescription = str2;
    }

    public /* synthetic */ PurchaseCompletedUiModel(String str, String str2, PurchaseCompletedKind purchaseCompletedKind, long j, long j2, long j3, Integer num, long j4, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? PurchaseCompletedKind.INSTANT : purchaseCompletedKind, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2, (i & 32) != 0 ? 0L : j3, (i & 64) != 0 ? null : num, (i & 128) == 0 ? j4 : 0L, (i & 256) == 0 ? str3 : null);
    }

    public final String getItemTitle() {
        return this.itemTitle;
    }

    public final String getItemIconUrl() {
        return this.itemIconUrl;
    }

    public final PurchaseCompletedKind getKind() {
        return this.kind;
    }

    public final long getInstantAmount() {
        return this.instantAmount;
    }

    public final long getBonusAmount() {
        return this.bonusAmount;
    }

    public final long getDailyCoins() {
        return this.dailyCoins;
    }

    public final Integer getPackageDays() {
        return this.packageDays;
    }

    public final long getTotalPackageValue() {
        return this.totalPackageValue;
    }

    public final String getEffectDescription() {
        return this.effectDescription;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(ARG_ITEM_TITLE, this.itemTitle);
        bundle.putString(ARG_ITEM_ICON_URL, this.itemIconUrl);
        bundle.putString(ARG_KIND, this.kind.name());
        bundle.putLong(ARG_INSTANT_AMOUNT, this.instantAmount);
        bundle.putLong(ARG_BONUS_AMOUNT, this.bonusAmount);
        bundle.putLong(ARG_DAILY_COINS, this.dailyCoins);
        Integer num = this.packageDays;
        bundle.putInt(ARG_PACKAGE_DAYS, num != null ? num.intValue() : -1);
        bundle.putLong(ARG_TOTAL_PACKAGE_VALUE, this.totalPackageValue);
        bundle.putString(ARG_EFFECT_DESCRIPTION, this.effectDescription);
        return bundle;
    }

    /* compiled from: PurchaseCompletedUiModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/dialogs/PurchaseCompletedUiModel$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_ITEM_TITLE", "", "ARG_ITEM_ICON_URL", "ARG_KIND", "ARG_INSTANT_AMOUNT", "ARG_BONUS_AMOUNT", "ARG_DAILY_COINS", "ARG_PACKAGE_DAYS", "ARG_TOTAL_PACKAGE_VALUE", "ARG_EFFECT_DESCRIPTION", "fromBundle", "Lorg/betup/ui/dialogs/PurchaseCompletedUiModel;", "bundle", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PurchaseCompletedUiModel fromBundle(Bundle bundle) {
            Object m10853constructorimpl;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            int i = bundle.getInt(PurchaseCompletedUiModel.ARG_PACKAGE_DAYS, -1);
            String string = bundle.getString(PurchaseCompletedUiModel.ARG_ITEM_TITLE);
            if (string == null) {
                string = "";
            }
            String str = string;
            String string2 = bundle.getString(PurchaseCompletedUiModel.ARG_ITEM_ICON_URL);
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                String string3 = bundle.getString(PurchaseCompletedUiModel.ARG_KIND, "INSTANT");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                m10853constructorimpl = Result.m10853constructorimpl(PurchaseCompletedKind.valueOf(string3));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
            }
            PurchaseCompletedKind purchaseCompletedKind = PurchaseCompletedKind.INSTANT;
            if (Result.m10859isFailureimpl(m10853constructorimpl)) {
                m10853constructorimpl = purchaseCompletedKind;
            }
            PurchaseCompletedKind purchaseCompletedKind2 = (PurchaseCompletedKind) m10853constructorimpl;
            long j = bundle.getLong(PurchaseCompletedUiModel.ARG_INSTANT_AMOUNT, 0L);
            long j2 = bundle.getLong(PurchaseCompletedUiModel.ARG_BONUS_AMOUNT, 0L);
            long j3 = bundle.getLong(PurchaseCompletedUiModel.ARG_DAILY_COINS, 0L);
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            return new PurchaseCompletedUiModel(str, string2, purchaseCompletedKind2, j, j2, j3, valueOf, bundle.getLong(PurchaseCompletedUiModel.ARG_TOTAL_PACKAGE_VALUE, 0L), bundle.getString(PurchaseCompletedUiModel.ARG_EFFECT_DESCRIPTION));
        }
    }
}
