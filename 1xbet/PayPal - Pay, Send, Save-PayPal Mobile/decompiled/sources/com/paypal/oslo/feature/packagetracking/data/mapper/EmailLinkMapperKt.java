package com.paypal.oslo.feature.packagetracking.data.mapper;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0006*\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0013\u0010\u0002\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\u0002\u0010\n\u001a\u0017\u0010\u0002\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0000¢\u0006\u0004\b\u0002\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Item;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "toDomain", "(Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Item;)Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkStatus;", "Lcom/paypal/oslo/feature/packagetracking/graphql/type/PackageEmailLinkStatus;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkStatus;", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkStatus;)Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkStatus;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Event;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEvent;", "(Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Event;)Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEvent;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkEventType;", "Lcom/paypal/oslo/feature/packagetracking/graphql/type/PackageEmailLinkEventType;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEventType;", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkEventType;)Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEventType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailLinkMapperKt {
    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailLink toDomain(com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus status = item.getStatus();
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus domain = status != null ? toDomain(status) : null;
        java.lang.String providerId = item.getProviderId();
        java.lang.Boolean isDataDeleted = item.isDataDeleted();
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider domain2 = com.paypal.oslo.feature.packagetracking.data.mapper.EmailProviderMapperKt.toDomain(item.getProvider());
        java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event> events = item.getEvents();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(events, 10));
        java.util.Iterator<T> it = events.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event) it.next()));
        }
        return new com.paypal.oslo.feature.packagetracking.domain.model.EmailLink(domain, providerId, isDataDeleted, domain2, arrayList);
    }

    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus toDomain(com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus packageEmailLinkStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageEmailLinkStatus, "");
        int i = com.paypal.oslo.feature.packagetracking.data.mapper.EmailLinkMapperKt.WhenMappings.$EnumSwitchMapping$0[packageEmailLinkStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.LINKED;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.LINKED_WITH_INVALID_PERMISSIONS;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.UNLINKED_BY_USER;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.UNLINKED_BY_SYSTEM;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.UNLINKED_BY_SYSTEM;
    }

    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent toDomain(com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        return new com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent(toDomain(event.getType()), event.getHasActiveReminder(), event.getReminderDateMessage());
    }

    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType toDomain(com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkEventType packageEmailLinkEventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageEmailLinkEventType, "");
        int i = com.paypal.oslo.feature.packagetracking.data.mapper.EmailLinkMapperKt.WhenMappings.$EnumSwitchMapping$1[packageEmailLinkEventType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType.RELINK_REMINDER;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType.RELINK_REMINDER;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus.LINKED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus.LINKED_WITH_INVALID_PERMISSIONS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus.UNLINKED_BY_USER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus.UNLINKED_BY_SYSTEM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkEventType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkEventType.RELINK_REMINDER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkEventType.UNKNOWN__.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
