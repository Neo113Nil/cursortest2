package com.paypal.oslo.feature.activity.domain.ledger.models;

@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b+\b\u0087\b\u0018\u0000 \u008e\u00012\u00020\u0001:\u0004\u008f\u0001\u008e\u0001B\u009d\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0015\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\u0014\b\u0002\u0010(\u001a\u000e\u0012\b\u0012\u00060&j\u0002`'\u0018\u00010\u0015\u0012\u0014\b\u0002\u0010+\u001a\u000e\u0012\b\u0012\u00060)j\u0002`*\u0018\u00010\u0015¢\u0006\u0004\b,\u0010-B\u0099\u0002\b\u0010\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0015\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0015\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0015\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b,\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00104J\u0010\u00107\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u00104J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u00104J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u00104J\u0010\u0010<\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b>\u00104J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00104J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u00104J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u00104J\u0012\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0014\u0010H\u001a\u00060\u0018j\u0002`\u0019HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0018\u0010L\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bL\u0010GJ\u0012\u0010M\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u001c\u0010S\u001a\u000e\u0012\b\u0012\u00060&j\u0002`'\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bS\u0010GJ\u001c\u0010T\u001a\u000e\u0012\b\u0012\u00060)j\u0002`*\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bT\u0010GJ¼\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\f\b\u0002\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0014\b\u0002\u0010(\u001a\u000e\u0012\b\u0012\u00060&j\u0002`'\u0018\u00010\u00152\u0014\b\u0002\u0010+\u001a\u000e\u0012\b\u0012\u00060)j\u0002`*\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\bU\u0010VJ\u001a\u0010Z\u001a\u00020Y2\b\u0010X\u001a\u0004\u0018\u00010WHÖ\u0003¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020.HÖ\u0001¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b^\u00104J'\u0010e\u001a\u00020d2\u0006\u0010_\u001a\u00020\u00002\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020bH\u0001¢\u0006\u0004\be\u0010fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010g\u001a\u0004\bh\u00104R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010g\u001a\u0004\bi\u00104R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010g\u001a\u0004\bj\u00104R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010k\u001a\u0004\bl\u00108R\"\u0010\b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010g\u001a\u0004\bm\u00104\"\u0004\bn\u0010oR\"\u0010\t\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010g\u001a\u0004\bp\u00104\"\u0004\bq\u0010oR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010g\u001a\u0004\br\u00104R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010s\u001a\u0004\bt\u0010=R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010g\u001a\u0004\bu\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010g\u001a\u0004\bv\u00104R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010g\u001a\u0004\bw\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010g\u001a\u0004\bx\u00104R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010y\u001a\u0004\bz\u0010CR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010{\u001a\u0004\b|\u0010E\"\u0004\b}\u0010~R#\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u0017\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010GR \u0010\u001a\u001a\u00060\u0018j\u0002`\u00198\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010IR$\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010KR#\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u001f\u0010\u007f\u001a\u0005\b\u0085\u0001\u0010GR\u001e\u0010!\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b!\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010NR\u001e\u0010#\u001a\u0004\u0018\u00010\"8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010PR\u001e\u0010%\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010RR'\u0010(\u001a\u000e\u0012\b\u0012\u00060&j\u0002`'\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\r\n\u0004\b(\u0010\u007f\u001a\u0005\b\u008c\u0001\u0010GR'\u0010+\u001a\u000e\u0012\b\u0012\u00060)j\u0002`*\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\r\n\u0004\b+\u0010\u007f\u001a\u0005\b\u008d\u0001\u0010G"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityBaseSection;", "", "id", "groupId", "invoiceId", "Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;", "avatar", "title", "date", "createdTime", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "amountInformation", "transactionShortDescription", "paymentStatus", "transactionETANote", "additionalInfo", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardInfo;", "rewardInfo", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "activityMoneyMovementDirection", "", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "action", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityStatus;", "activityStatus", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityShipmentPackage;", "shipmentPackages", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;", "activityFlags", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;", "activityPartnerInfo", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;", "subdomain", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityChannel;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityChannel;", "channels", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityPurpose;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityPurpose;", "purposes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardInfo;Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;Ljava/util/List;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardInfo;Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;Ljava/util/List;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "component9", "component10", "component11", "component12", "component13", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardInfo;", "component14", "()Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "component15", "()Ljava/util/List;", "component16", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "component17", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "component18", "component19", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;", "component20", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;", "component21", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;", "component22", "component23", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardInfo;Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;Ljava/util/List;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "getGroupId", "getInvoiceId", "Lcom/paypal/oslo/feature/activity/domain/common/models/CounterPartyAvatar;", "getAvatar", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getDate", "setDate", "getCreatedTime", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCounterPartyAmountInformation;", "getAmountInformation", "getTransactionShortDescription", "getPaymentStatus", "getTransactionETANote", "getAdditionalInfo", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardInfo;", "getRewardInfo", "Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;", "getActivityMoneyMovementDirection", "setActivityMoneyMovementDirection", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityMoneyMovementDirection;)V", "Ljava/util/List;", "getAction", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "getActivityStatus", "getShipmentPackages", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;", "getActivityFlags", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;", "getActivityPartnerInfo", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivitySubdomain;", "getSubdomain", "getChannels", "getPurposes", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ActivityTransactionModel extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityBaseSection {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> action;
    private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags;
    private com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection;
    private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus;
    private final java.lang.String additionalInfo;
    private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation amountInformation;
    private final com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar avatar;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> channels;
    private final java.lang.String createdTime;
    private java.lang.String date;
    private final java.lang.String groupId;
    private final java.lang.String id;
    private final java.lang.String invoiceId;
    private final java.lang.String paymentStatus;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityPurpose> purposes;
    private final com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo;
    private final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> shipmentPackages;
    private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain subdomain;
    private java.lang.String title;
    private final java.lang.String transactionETANote;
    private final java.lang.String transactionShortDescription;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.Companion INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.m11785$r8$lambda$nK1dt2P7JjHFSKZzNZtLouUNc();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.api.graphql.schema.type.ActivityType", com.paypal.oslo.api.graphql.schema.type.ActivityType.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.api.graphql.schema.type.ActivityStatus", com.paypal.oslo.api.graphql.schema.type.ActivityStatus.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.$r8$lambda$LNOx77yc57h27RsOiJMjJhBuyTw();
        }
    }), null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.$r8$lambda$eoh8y2tNbmZHVMg4KCMPcfldjuQ();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.m11784$r8$lambda$jL_UUUCdA7cX_sXWSE8jxfV7V4();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel> serializer() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActivityTransactionModel(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection, java.util.List list, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus, java.util.List list2, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo, com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain activitySubdomain, java.util.List list3, java.util.List list4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (57851 != (i & 57851)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 57851, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.groupId = str2;
        if ((i & 4) == 0) {
            this.invoiceId = null;
        } else {
            this.invoiceId = str3;
        }
        this.avatar = counterPartyAvatar;
        this.title = str4;
        this.date = str5;
        this.createdTime = str6;
        this.amountInformation = activityCounterPartyAmountInformation;
        this.transactionShortDescription = str7;
        if ((i & 512) == 0) {
            this.paymentStatus = null;
        } else {
            this.paymentStatus = str8;
        }
        if ((i & 1024) == 0) {
            this.transactionETANote = null;
        } else {
            this.transactionETANote = str9;
        }
        if ((i & 2048) == 0) {
            this.additionalInfo = null;
        } else {
            this.additionalInfo = str10;
        }
        if ((i & 4096) == 0) {
            this.rewardInfo = null;
        } else {
            this.rewardInfo = rewardInfo;
        }
        this.activityMoneyMovementDirection = activityMoneyMovementDirection;
        this.action = list;
        this.type = activityType;
        if ((65536 & i) == 0) {
            this.activityStatus = null;
        } else {
            this.activityStatus = activityStatus;
        }
        if ((131072 & i) == 0) {
            this.shipmentPackages = null;
        } else {
            this.shipmentPackages = list2;
        }
        if ((262144 & i) == 0) {
            this.activityFlags = null;
        } else {
            this.activityFlags = activityFlags;
        }
        if ((524288 & i) == 0) {
            this.activityPartnerInfo = null;
        } else {
            this.activityPartnerInfo = activityPartnerInfo;
        }
        if ((1048576 & i) == 0) {
            this.subdomain = null;
        } else {
            this.subdomain = activitySubdomain;
        }
        if ((2097152 & i) == 0) {
            this.channels = null;
        } else {
            this.channels = list3;
        }
        if ((i & 4194304) == 0) {
            this.purposes = null;
        } else {
            this.purposes = list4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityTransactionModel(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection, java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> list, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus, java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> list2, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo, com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain activitySubdomain, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityChannel> list3, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityPurpose> list4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(counterPartyAvatar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityCounterPartyAmountInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "");
        this.id = str;
        this.groupId = str2;
        this.invoiceId = str3;
        this.avatar = counterPartyAvatar;
        this.title = str4;
        this.date = str5;
        this.createdTime = str6;
        this.amountInformation = activityCounterPartyAmountInformation;
        this.transactionShortDescription = str7;
        this.paymentStatus = str8;
        this.transactionETANote = str9;
        this.additionalInfo = str10;
        this.rewardInfo = rewardInfo;
        this.activityMoneyMovementDirection = activityMoneyMovementDirection;
        this.action = list;
        this.type = activityType;
        this.activityStatus = activityStatus;
        this.shipmentPackages = list2;
        this.activityFlags = activityFlags;
        this.activityPartnerInfo = activityPartnerInfo;
        this.subdomain = activitySubdomain;
        this.channels = list3;
        this.purposes = list4;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.groupId);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.invoiceId != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.invoiceId);
        }
        output.encodeSerializableElement(serialDesc, 3, com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar$$serializer.INSTANCE, self.avatar);
        output.encodeStringElement(serialDesc, 4, self.title);
        output.encodeStringElement(serialDesc, 5, self.date);
        output.encodeStringElement(serialDesc, 6, self.createdTime);
        output.encodeSerializableElement(serialDesc, 7, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation$$serializer.INSTANCE, self.amountInformation);
        output.encodeStringElement(serialDesc, 8, self.transactionShortDescription);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.paymentStatus != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.paymentStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.transactionETANote != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.transactionETANote);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.additionalInfo != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.additionalInfo);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.rewardInfo != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo$$serializer.INSTANCE, self.rewardInfo);
        }
        output.encodeNullableSerializableElement(serialDesc, 13, lazyArr[13].getValue(), self.activityMoneyMovementDirection);
        output.encodeNullableSerializableElement(serialDesc, 14, lazyArr[14].getValue(), self.action);
        output.encodeSerializableElement(serialDesc, 15, lazyArr[15].getValue(), self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.activityStatus != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, lazyArr[16].getValue(), self.activityStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.shipmentPackages != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, lazyArr[17].getValue(), self.shipmentPackages);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.activityFlags != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags$$serializer.INSTANCE, self.activityFlags);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.activityPartnerInfo != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo$$serializer.INSTANCE, self.activityPartnerInfo);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.subdomain != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain$$serializer.INSTANCE, self.subdomain);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.channels != null) {
            output.encodeNullableSerializableElement(serialDesc, 21, lazyArr[21].getValue(), self.channels);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 22) || self.purposes != null) {
            output.encodeNullableSerializableElement(serialDesc, 22, lazyArr[22].getValue(), self.purposes);
        }
    }

    public /* synthetic */ ActivityTransactionModel(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection, java.util.List list, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus, java.util.List list2, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo, com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain activitySubdomain, java.util.List list3, java.util.List list4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, counterPartyAvatar, str4, str5, str6, activityCounterPartyAmountInformation, str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : rewardInfo, activityMoneyMovementDirection, list, activityType, (65536 & i) != 0 ? null : activityStatus, (131072 & i) != 0 ? null : list2, (262144 & i) != 0 ? null : activityFlags, (524288 & i) != 0 ? null : activityPartnerInfo, (1048576 & i) != 0 ? null : activitySubdomain, (2097152 & i) != 0 ? null : list3, (i & 4194304) != 0 ? null : list4);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getGroupId() {
        return this.groupId;
    }

    public final java.lang.String getInvoiceId() {
        return this.invoiceId;
    }

    public final com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar getAvatar() {
        return this.avatar;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final void setTitle(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    public final java.lang.String getDate() {
        return this.date;
    }

    public final void setDate(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.date = str;
    }

    public final java.lang.String getCreatedTime() {
        return this.createdTime;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation getAmountInformation() {
        return this.amountInformation;
    }

    public final java.lang.String getTransactionShortDescription() {
        return this.transactionShortDescription;
    }

    public final java.lang.String getPaymentStatus() {
        return this.paymentStatus;
    }

    public final java.lang.String getTransactionETANote() {
        return this.transactionETANote;
    }

    public final java.lang.String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo getRewardInfo() {
        return this.rewardInfo;
    }

    public final com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection getActivityMoneyMovementDirection() {
        return this.activityMoneyMovementDirection;
    }

    public final void setActivityMoneyMovementDirection(com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection) {
        this.activityMoneyMovementDirection = activityMoneyMovementDirection;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> getAction() {
        return this.action;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityType getType() {
        return this.type;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityStatus getActivityStatus() {
        return this.activityStatus;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> getShipmentPackages() {
        return this.shipmentPackages;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags getActivityFlags() {
        return this.activityFlags;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo getActivityPartnerInfo() {
        return this.activityPartnerInfo;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain getSubdomain() {
        return this.subdomain;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> getChannels() {
        return this.channels;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityPurpose> getPurposes() {
        return this.purposes;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$LNOx77yc57h27RsOiJMjJhBuyTw() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage$$serializer.INSTANCE);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$eoh8y2tNbmZHVMg4KCMPcfldjuQ() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.api.graphql.schema.type.ActivityChannel", com.paypal.oslo.api.graphql.schema.type.ActivityChannel.values()));
    }

    /* renamed from: $r8$lambda$jL_UUUCdA7cX_sXWSE-8jxfV7V4, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m11784$r8$lambda$jL_UUUCdA7cX_sXWSE8jxfV7V4() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.api.graphql.schema.type.ActivityPurpose", com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.values()));
    }

    /* renamed from: $r8$lambda$nK1dt2P7-JjHFSKZzNZt-LouUNc, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m11785$r8$lambda$nK1dt2P7JjHFSKZzNZtLouUNc() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.groupId;
        java.lang.String str3 = this.invoiceId;
        com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar = this.avatar;
        java.lang.String str4 = this.title;
        java.lang.String str5 = this.date;
        java.lang.String str6 = this.createdTime;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation = this.amountInformation;
        java.lang.String str7 = this.transactionShortDescription;
        java.lang.String str8 = this.paymentStatus;
        java.lang.String str9 = this.transactionETANote;
        java.lang.String str10 = this.additionalInfo;
        com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo = this.rewardInfo;
        com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection = this.activityMoneyMovementDirection;
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> list = this.action;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType = this.type;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus = this.activityStatus;
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> list2 = this.shipmentPackages;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags = this.activityFlags;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo = this.activityPartnerInfo;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain activitySubdomain = this.subdomain;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> list3 = this.channels;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityPurpose> list4 = this.purposes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityTransactionModel(id=");
        sb.append(str);
        sb.append(", groupId=");
        sb.append(str2);
        sb.append(", invoiceId=");
        sb.append(str3);
        sb.append(", avatar=");
        sb.append(counterPartyAvatar);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", date=");
        sb.append(str5);
        sb.append(", createdTime=");
        sb.append(str6);
        sb.append(", amountInformation=");
        sb.append(activityCounterPartyAmountInformation);
        sb.append(", transactionShortDescription=");
        sb.append(str7);
        sb.append(", paymentStatus=");
        sb.append(str8);
        sb.append(", transactionETANote=");
        sb.append(str9);
        sb.append(", additionalInfo=");
        sb.append(str10);
        sb.append(", rewardInfo=");
        sb.append(rewardInfo);
        sb.append(", activityMoneyMovementDirection=");
        sb.append(activityMoneyMovementDirection);
        sb.append(", action=");
        sb.append(list);
        sb.append(", type=");
        sb.append(activityType);
        sb.append(", activityStatus=");
        sb.append(activityStatus);
        sb.append(", shipmentPackages=");
        sb.append(list2);
        sb.append(", activityFlags=");
        sb.append(activityFlags);
        sb.append(", activityPartnerInfo=");
        sb.append(activityPartnerInfo);
        sb.append(", subdomain=");
        sb.append(activitySubdomain);
        sb.append(", channels=");
        sb.append(list3);
        sb.append(", purposes=");
        sb.append(list4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.groupId.hashCode();
        java.lang.String str = this.invoiceId;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.avatar.hashCode();
        int hashCode5 = this.title.hashCode();
        int hashCode6 = this.date.hashCode();
        int hashCode7 = this.createdTime.hashCode();
        int hashCode8 = this.amountInformation.hashCode();
        int hashCode9 = this.transactionShortDescription.hashCode();
        java.lang.String str2 = this.paymentStatus;
        int hashCode10 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.transactionETANote;
        int hashCode11 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.additionalInfo;
        int hashCode12 = str4 == null ? 0 : str4.hashCode();
        com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo = this.rewardInfo;
        int hashCode13 = rewardInfo == null ? 0 : rewardInfo.hashCode();
        com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection = this.activityMoneyMovementDirection;
        int hashCode14 = activityMoneyMovementDirection == null ? 0 : activityMoneyMovementDirection.hashCode();
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> list = this.action;
        int hashCode15 = list == null ? 0 : list.hashCode();
        int hashCode16 = this.type.hashCode();
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus = this.activityStatus;
        int hashCode17 = activityStatus == null ? 0 : activityStatus.hashCode();
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> list2 = this.shipmentPackages;
        int hashCode18 = list2 == null ? 0 : list2.hashCode();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags = this.activityFlags;
        int hashCode19 = activityFlags == null ? 0 : activityFlags.hashCode();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo = this.activityPartnerInfo;
        int hashCode20 = activityPartnerInfo == null ? 0 : activityPartnerInfo.hashCode();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain activitySubdomain = this.subdomain;
        int hashCode21 = activitySubdomain == null ? 0 : activitySubdomain.hashCode();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> list3 = this.channels;
        int hashCode22 = list3 == null ? 0 : list3.hashCode();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityPurpose> list4 = this.purposes;
        return (((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, activityTransactionModel.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.groupId, activityTransactionModel.groupId) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceId, activityTransactionModel.invoiceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.avatar, activityTransactionModel.avatar) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, activityTransactionModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.date, activityTransactionModel.date) && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, activityTransactionModel.createdTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountInformation, activityTransactionModel.amountInformation) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionShortDescription, activityTransactionModel.transactionShortDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentStatus, activityTransactionModel.paymentStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionETANote, activityTransactionModel.transactionETANote) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalInfo, activityTransactionModel.additionalInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardInfo, activityTransactionModel.rewardInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityMoneyMovementDirection, activityTransactionModel.activityMoneyMovementDirection) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, activityTransactionModel.action) && this.type == activityTransactionModel.type && this.activityStatus == activityTransactionModel.activityStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.shipmentPackages, activityTransactionModel.shipmentPackages) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityFlags, activityTransactionModel.activityFlags) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityPartnerInfo, activityTransactionModel.activityPartnerInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.subdomain, activityTransactionModel.subdomain) && kotlin.jvm.internal.Intrinsics.areEqual(this.channels, activityTransactionModel.channels) && kotlin.jvm.internal.Intrinsics.areEqual(this.purposes, activityTransactionModel.purposes);
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel copy(java.lang.String id, java.lang.String groupId, java.lang.String invoiceId, com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar avatar, java.lang.String title, java.lang.String date, java.lang.String createdTime, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation amountInformation, java.lang.String transactionShortDescription, java.lang.String paymentStatus, java.lang.String transactionETANote, java.lang.String additionalInfo, com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo, com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection, java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> action, com.paypal.oslo.api.graphql.schema.type.ActivityType type, com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus, java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> shipmentPackages, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo, com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain subdomain, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityChannel> channels, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityPurpose> purposes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(groupId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionShortDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel(id, groupId, invoiceId, avatar, title, date, createdTime, amountInformation, transactionShortDescription, paymentStatus, transactionETANote, additionalInfo, rewardInfo, activityMoneyMovementDirection, action, type, activityStatus, shipmentPackages, activityFlags, activityPartnerInfo, subdomain, channels, purposes);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getTransactionShortDescription() {
        return this.transactionShortDescription;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation getAmountInformation() {
        return this.amountInformation;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCreatedTime() {
        return this.createdTime;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getDate() {
        return this.date;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar getAvatar() {
        return this.avatar;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getInvoiceId() {
        return this.invoiceId;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityPurpose> component23() {
        return this.purposes;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> component22() {
        return this.channels;
    }

    /* renamed from: component21, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain getSubdomain() {
        return this.subdomain;
    }

    /* renamed from: component20, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo getActivityPartnerInfo() {
        return this.activityPartnerInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component19, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags getActivityFlags() {
        return this.activityFlags;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityShipmentPackage> component18() {
        return this.shipmentPackages;
    }

    /* renamed from: component17, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityStatus getActivityStatus() {
        return this.activityStatus;
    }

    /* renamed from: component16, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityType getType() {
        return this.type;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> component15() {
        return this.action;
    }

    /* renamed from: component14, reason: from getter */
    public final com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection getActivityMoneyMovementDirection() {
        return this.activityMoneyMovementDirection;
    }

    /* renamed from: component13, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo getRewardInfo() {
        return this.rewardInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getTransactionETANote() {
        return this.transactionETANote;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getPaymentStatus() {
        return this.paymentStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
