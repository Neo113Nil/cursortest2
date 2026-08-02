package com.paypal.oslo.feature.packagetracking.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "toGraphQL", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;)Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailProviderMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider toGraphQL(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        int i = com.paypal.oslo.feature.packagetracking.data.mapper.EmailProviderMapperKt.WhenMappings.$EnumSwitchMapping$0[emailProvider.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider.GMAIL;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider.OUTLOOK;
    }

    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider toDomain(com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageTrackingIdentityProvider, "");
        int i = com.paypal.oslo.feature.packagetracking.data.mapper.EmailProviderMapperKt.WhenMappings.$EnumSwitchMapping$1[packageTrackingIdentityProvider.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.GMAIL;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.OUTLOOK;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.GMAIL;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.values().length];
            try {
                iArr[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.GMAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.OUTLOOK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider.GMAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider.OUTLOOK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
