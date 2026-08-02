package com.paypal.oslo.feature.businesscustomers.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "Lcom/paypal/pds/components/AvatarSource;", "buildAvatar", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/AvatarSource;", "", "initials", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvatarUtilKt {
    public static final com.paypal.pds.components.AvatarSource buildAvatar(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.pds.components.AvatarSource.Icon icon;
        com.paypal.pds.components.AvatarSource.Image image;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1180498435, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.utils.buildAvatar (AvatarUtil.kt:24)");
        }
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name2 = customer.getName();
        java.lang.String businessName = name2 != null ? name2.getBusinessName() : null;
        if (businessName == null || businessName.length() == 0) {
            composer.startReplaceGroup(1036744766);
            int i2 = i & 14;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-597922130, i2, -1, "com.paypal.oslo.feature.businesscustomers.ui.utils.buildUserAvatar (AvatarUtil.kt:46)");
            }
            java.lang.String initials = initials(customer);
            java.lang.String photoUrl = customer.getPhotoUrl();
            if (photoUrl != null && photoUrl.length() > 0) {
                composer.startReplaceGroup(-1468652988);
                com.paypal.pds.components.AvatarSource.Image image2 = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).scale(com.paypal.oslo.core.commonui.components.Scale.FIT).data(customer.getPhotoUrl()).build(), null, null, null, null, composer, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30), null, 2, null);
                composer.endReplaceGroup();
                image = image2;
            } else {
                if (initials != null && initials.length() > 0) {
                    composer.startReplaceGroup(-1468316266);
                    composer.endReplaceGroup();
                    icon = new com.paypal.pds.components.AvatarSource.Initials(initials);
                } else {
                    composer.startReplaceGroup(-1468237929);
                    composer.endReplaceGroup();
                    icon = new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Person.INSTANCE);
                }
                image = icon;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1036783578);
            int i3 = i & 14;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-631876117, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.utils.buildMerchantAvatar (AvatarUtil.kt:32)");
            }
            java.lang.String photoUrl2 = customer.getPhotoUrl();
            if (photoUrl2 == null || photoUrl2.length() == 0) {
                composer.startReplaceGroup(620342755);
                composer.endReplaceGroup();
                image = new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Store.INSTANCE);
            } else {
                composer.startReplaceGroup(620406987);
                com.paypal.pds.components.AvatarSource.Image image3 = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).scale(com.paypal.oslo.core.commonui.components.Scale.FIT).data(customer.getPhotoUrl()).build(), null, null, null, null, composer, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30), null, 2, null);
                composer.endReplaceGroup();
                image = image3;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return image;
    }

    public static final java.lang.String initials(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName personName;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name2 = customer.getName();
        if (name2 != null && (personName = name2.getPersonName()) != null) {
            java.lang.String givenName = personName.getGivenName();
            java.lang.String highSpeedVideoFpsRangesFor = givenName != null ? getHighSpeedVideoFpsRangesFor(givenName) : null;
            java.lang.String surname = personName.getSurname();
            java.lang.String highSpeedVideoFpsRangesFor2 = surname != null ? getHighSpeedVideoFpsRangesFor(surname) : null;
            java.lang.String str2 = highSpeedVideoFpsRangesFor;
            if ((str2 != null && str2.length() != 0) || ((str = highSpeedVideoFpsRangesFor2) != null && str.length() != 0)) {
                if (str2 == null || str2.length() == 0) {
                    return highSpeedVideoFpsRangesFor2;
                }
                java.lang.String str3 = highSpeedVideoFpsRangesFor2;
                if (str3 == null || str3.length() == 0) {
                    return highSpeedVideoFpsRangesFor;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(highSpeedVideoFpsRangesFor);
                sb.append(highSpeedVideoFpsRangesFor2);
                return sb.toString();
            }
        }
        return null;
    }

    private static final java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.String obj = kotlin.text.StringsKt.trim(str).toString();
        if (obj.length() <= 0) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        java.lang.String substring = obj.substring(0, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }
}
