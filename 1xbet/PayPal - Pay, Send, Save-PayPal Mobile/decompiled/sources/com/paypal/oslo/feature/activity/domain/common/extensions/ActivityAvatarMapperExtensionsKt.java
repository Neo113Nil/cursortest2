package com.paypal.oslo.feature.activity.domain.common.extensions;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0001*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u001d\u0010\r\u001a\u00020\u0001*\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u0001*\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\" \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragment;", "Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;", "toCounterPartyAvatar", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragment;)Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;", "", "Lcom/paypal/pds/core/Icon;", "getAvatarIconBasedOnName", "(Ljava/lang/String;)Lcom/paypal/pds/core/Icon;", "toGenericActivityAvatar", "(Lcom/paypal/pds/core/Icon;)Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;", "toIconActivityAvatar", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityIconType;", "iconType", "toImageActivityAvatar", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityIconType;)Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;", "toInitialActivityAvatar", "Lcom/paypal/oslo/feature/activity/domain/common/models/AvatarBadgeType;", "toAvatarBadgeType", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityIconType;)Lcom/paypal/oslo/feature/activity/domain/common/models/AvatarBadgeType;", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityAvatarMapperExtensionsKt {
    private static final java.util.Map<java.lang.String, com.paypal.pds.core.Icon> Camera2StreamConfigurationMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("profile", com.paypal.pds.core.Icon.Person.INSTANCE), kotlin.TuplesKt.to("merchant", com.paypal.pds.core.Icon.Store.INSTANCE), kotlin.TuplesKt.to("bank", com.paypal.pds.core.Icon.Bank.INSTANCE), kotlin.TuplesKt.to("transfer", com.paypal.pds.core.Icon.ArrowsLeftRight.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_CASHBACK, com.paypal.pds.core.Icon.CurrencyUsdCircle.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_GOALS_VALUE, com.paypal.pds.core.Icon.Target.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_REQUEST_MONEY_VALUE, com.paypal.pds.core.Icon.ArrowDownLine.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_TOP_UP_VALUE, com.paypal.pds.core.Icon.ArrowUpLine.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_CASH_CHECK_VALUE, com.paypal.pds.core.Icon.Scan.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_LOGO_PAYPAL_VALUE, com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_DONATE_AVATAR_ICON, com.paypal.pds.core.Icon.Heart.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_PAYPAL_GROUPS, com.paypal.pds.core.Icon.PersonTwo.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_MONEY_POOLS_VALUE, com.paypal.pds.core.Icon.PersonPlus.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_CREDIT_CARD, com.paypal.pds.core.Icon.Card.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_MC_CREDIT_CARD, com.paypal.pds.core.Icon.Card.INSTANCE));

    public static final com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar toCounterPartyAvatar(com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment activityAvatarDetailFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityAvatarDetailFragment, "");
        com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment imageActivityAvatarFragment = activityAvatarDetailFragment.getImageActivityAvatarFragment();
        if ((imageActivityAvatarFragment != null ? imageActivityAvatarFragment.getUrl() : null) != null) {
            if (kotlin.text.StringsKt.isBlank(kotlin.text.StringsKt.trim(activityAvatarDetailFragment.getImageActivityAvatarFragment().getUrl().toString()).toString())) {
                return toIconActivityAvatar(getAvatarIconBasedOnName(activityAvatarDetailFragment.getImageActivityAvatarFragment().getFallBackAvatar().getName()));
            }
            return toImageActivityAvatar(activityAvatarDetailFragment.getImageActivityAvatarFragment().getUrl().toString(), activityAvatarDetailFragment.getImageActivityAvatarFragment().getIconType());
        }
        com.paypal.oslo.feature.activity.graphql.fragment.InitialsActivityAvatarFragment initialsActivityAvatarFragment = activityAvatarDetailFragment.getInitialsActivityAvatarFragment();
        java.lang.String initials = initialsActivityAvatarFragment != null ? initialsActivityAvatarFragment.getInitials() : null;
        if (initials != null && !kotlin.text.StringsKt.isBlank(initials)) {
            return toInitialActivityAvatar(activityAvatarDetailFragment.getInitialsActivityAvatarFragment().getInitials(), activityAvatarDetailFragment.getInitialsActivityAvatarFragment().getIconType());
        }
        com.paypal.oslo.feature.activity.graphql.fragment.IconActivityAvatarFragment iconActivityAvatarFragment = activityAvatarDetailFragment.getIconActivityAvatarFragment();
        java.lang.String name2 = iconActivityAvatarFragment != null ? iconActivityAvatarFragment.getName() : null;
        if (name2 != null && !kotlin.text.StringsKt.isBlank(name2)) {
            return toIconActivityAvatar(getAvatarIconBasedOnName(activityAvatarDetailFragment.getIconActivityAvatarFragment().getName()));
        }
        com.paypal.oslo.feature.activity.graphql.fragment.GenericActivityAvatarFragment genericActivityAvatarFragment = activityAvatarDetailFragment.getGenericActivityAvatarFragment();
        java.lang.String name3 = genericActivityAvatarFragment != null ? genericActivityAvatarFragment.getName() : null;
        if (name3 != null && !kotlin.text.StringsKt.isBlank(name3)) {
            return toGenericActivityAvatar(getAvatarIconBasedOnName(activityAvatarDetailFragment.getGenericActivityAvatarFragment().getName()));
        }
        return toGenericActivityAvatar(getAvatarIconBasedOnName("profile"));
    }

    public static final com.paypal.pds.core.Icon getAvatarIconBasedOnName(java.lang.String str) {
        java.lang.Object obj;
        com.paypal.pds.core.Icon icon;
        java.lang.String str2 = str;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            return com.paypal.pds.core.Icon.Person.INSTANCE;
        }
        java.util.Iterator<T> it = Camera2StreamConfigurationMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.equals(str, (java.lang.String) ((java.util.Map.Entry) obj).getKey(), true)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return (entry == null || (icon = (com.paypal.pds.core.Icon) entry.getValue()) == null) ? com.paypal.pds.core.Icon.Person.INSTANCE : icon;
    }

    public static final com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar toGenericActivityAvatar(com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        return new com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar(new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar(icon, null, 2, null), 0, (com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar toIconActivityAvatar(com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        return new com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar(new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar(icon, null, 2, null), 0, (com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar toImageActivityAvatar(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityIconType activityIconType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar(new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.ImageActivityAvatar(kotlin.text.StringsKt.trim(str).toString(), null, null, 6, null), 0, toAvatarBadgeType(activityIconType), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar toInitialActivityAvatar(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityIconType activityIconType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar(new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.InitialsActivityAvatar(kotlin.text.StringsKt.trim(str).toString(), null, 2, null), 0, toAvatarBadgeType(activityIconType), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType toAvatarBadgeType(com.paypal.oslo.api.graphql.schema.type.ActivityIconType activityIconType) {
        if (activityIconType != null && com.paypal.oslo.feature.activity.domain.common.extensions.ActivityAvatarMapperExtensionsKt.WhenMappings.$EnumSwitchMapping$0[activityIconType.ordinal()] == 1) {
            return com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType.VENMO;
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityIconType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityIconType.VENMO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
