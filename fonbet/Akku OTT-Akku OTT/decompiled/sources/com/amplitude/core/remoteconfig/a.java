package com.amplitude.core.remoteconfig;

import com.amplitude.core.i;
import com.amplitude.core.k;
import com.amplitude.core.utilities.http.d;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1101n0;
import kotlinx.coroutines.internal.C1086c;

@SourceDebugExtension({"SMAP\nRemoteConfigClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfigClient.kt\ncom/amplitude/core/remoteconfig/RemoteConfigClientImpl\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,508:1\n72#2,2:509\n1#3:511\n1549#4:512\n1620#4,3:513\n1747#4,3:516\n1855#4,2:521\n1726#4,3:523\n215#5,2:519\n494#6,7:526\n*S KotlinDebug\n*F\n+ 1 RemoteConfigClient.kt\ncom/amplitude/core/remoteconfig/RemoteConfigClientImpl\n*L\n140#1:509,2\n140#1:511\n227#1:512\n227#1:513,3\n234#1:516,3\n352#1:521,2\n421#1:523,3\n340#1:519,2\n444#1:526,7\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    public static final C0044a Companion = new C0044a();
    public final k a;
    public final com.amplitude.common.a b;

    /* renamed from: com.amplitude.core.remoteconfig.a$a, reason: collision with other inner class name */
    public static final class C0044a {
    }

    public a(String apiKey, i serverZone, C1086c coroutineScope, C1101n0 networkIODispatcher, C1101n0 storageIODispatcher, k storage, d httpClient, com.amplitude.common.a logger) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(serverZone, "serverZone");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(networkIODispatcher, "networkIODispatcher");
        Intrinsics.checkNotNullParameter(storageIODispatcher, "storageIODispatcher");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = storage;
        this.b = logger;
        new ConcurrentHashMap();
    }
}
