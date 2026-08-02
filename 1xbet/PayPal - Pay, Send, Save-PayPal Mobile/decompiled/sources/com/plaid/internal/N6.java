package com.plaid.internal;

/* loaded from: classes16.dex */
public final class N6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.i8 f5864a;
    public final java.lang.String b;
    public final com.plaid.internal.I c;
    public final kotlinx.coroutines.CoroutineDispatcher d;
    public volatile java.lang.String e;
    public volatile java.lang.String f;
    public volatile java.lang.String g;

    @javax.inject.Inject
    public N6(com.plaid.internal.i8 i8Var, java.lang.String str, com.plaid.internal.I i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i, "");
        this.f5864a = i8Var;
        this.b = str;
        this.c = i;
        this.d = kotlinx.coroutines.Dispatchers.getIO().limitedParallelism(1);
    }

    public static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest a(com.plaid.internal.N6 n6, java.util.ArrayList arrayList, java.lang.String str) {
        com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b bVar;
        com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.a newBuilder = com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession.newBuilder();
        java.lang.String str2 = n6.f;
        if (str2 != null) {
            newBuilder.a(str2);
        }
        newBuilder.b(n6.b);
        newBuilder.c(str);
        java.lang.String str3 = n6.g;
        if (str3 != null) {
            newBuilder.d(str3);
        }
        com.plaid.internal.I i = n6.c;
        com.plaid.internal.I5 i5 = i.f5805a;
        android.os.Bundle bundle = i5.f5812a.getPackageManager().getApplicationInfo(i5.f5812a.getPackageName(), 128).metaData;
        java.lang.String string = bundle != null ? bundle.getString("com.github.jorgefspereira.plaid_flutter.version") : null;
        com.plaid.internal.I5 i52 = i.f5805a;
        android.os.Bundle bundle2 = i52.f5812a.getPackageManager().getApplicationInfo(i52.f5812a.getPackageName(), 128).metaData;
        java.lang.String string2 = bundle2 != null ? bundle2.getString("com.plaid.link.react_native") : null;
        newBuilder.a((string == null || kotlin.text.StringsKt.isBlank(string)) ? (string2 == null || kotlin.text.StringsKt.isBlank(string2)) ? com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_ANDROID : com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_REACTNATIVEANDROID : com.plaid.internal.core.protos.link.api.Mobile.MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_FLUTTERANDROID);
        com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.MobileSDKSession build = newBuilder.build();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.plaid.internal.I6 i6 = (com.plaid.internal.I6) it.next();
            com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.a newBuilder2 = com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.newBuilder();
            com.plaid.internal.J6 j6 = i6.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j6, "");
            int i2 = com.plaid.internal.K6.f5826a[j6.ordinal()];
            if (i2 == 1) {
                bVar = com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_DEBUG;
            } else if (i2 == 2) {
                bVar = com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_INFO;
            } else if (i2 == 3) {
                bVar = com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_WARN;
            } else {
                if (i2 != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                bVar = com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_ERROR;
            }
            arrayList2.add(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.newBuilder().a(com.google.protobuf.Timestamp.newBuilder().setSeconds(i6.b / 1000).setNanos((int) ((i6.b % 1000) * 1000000))).a(str).a(newBuilder2.a(bVar).a(i6.f5813a).a(i6.c).a(build).build()).build());
        }
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest build2 = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.newBuilder().b(str).a(arrayList2).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
        return build2;
    }

    public final void a(java.lang.String str) {
        if (this.e != null && !kotlin.jvm.internal.Intrinsics.areEqual(this.e, str)) {
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            java.lang.String str2 = this.e;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoteLogSender: Link session ID is being changed from ");
            sb.append(str2);
            sb.append(" to ");
            sb.append(str);
            com.plaid.internal.C0452a6.a.e(aVar, sb.toString());
        }
        this.e = str;
        com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("RemoteLogSender: link_session_id set: ".concat(java.lang.String.valueOf(str)), true);
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        this.f = str;
        this.g = str2;
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoteLogSender: session data set: linkOpenId=");
        sb.append(str);
        sb.append(", linkToken=");
        sb.append(str2);
        com.plaid.internal.C0452a6.a.a(sb.toString(), true);
    }

    public final java.lang.Object a(java.util.ArrayList arrayList, com.plaid.internal.H6.b bVar) {
        java.lang.String str = this.e;
        if (str == null) {
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "RemoteLogSender: Cannot send events without link_session_id");
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.d, new com.plaid.internal.M6(this, arrayList, str, null), bVar);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
