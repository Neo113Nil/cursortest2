package com.amplitude.core;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.C1101n0;
import kotlinx.coroutines.internal.C1086c;

/* loaded from: classes3.dex */
public interface k {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a i;
        public static final a j;
        public static final /* synthetic */ a[] k;
        public static final /* synthetic */ EnumEntries l;
        public final String a;

        static {
            a aVar = new a("LAST_EVENT_ID", 0, "last_event_id");
            b = aVar;
            a aVar2 = new a("PREVIOUS_SESSION_ID", 1, "previous_session_id");
            c = aVar2;
            a aVar3 = new a("LAST_EVENT_TIME", 2, "last_event_time");
            d = aVar3;
            a aVar4 = new a("OPT_OUT", 3, "opt_out");
            e = aVar4;
            a aVar5 = new a("Events", 4, "events");
            f = aVar5;
            a aVar6 = new a("APP_VERSION", 5, "app_version");
            i = aVar6;
            a aVar7 = new a("APP_BUILD", 6, "app_build");
            j = aVar7;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, new a("REMOTE_CONFIG", 7, "remote_config"), new a("REMOTE_CONFIG_TIMESTAMP", 8, "remote_config_timestamp")};
            k = aVarArr;
            l = EnumEntriesKt.enumEntries(aVarArr);
        }

        public a(String str, int i2, String str2) {
            this.a = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) k.clone();
        }
    }

    List<Object> a();

    Object b(Object obj, Continuation<? super String> continuation);

    Object c(ContinuationImpl continuationImpl);

    Unit d(a aVar, String str);

    String f(a aVar);

    com.amplitude.core.utilities.http.h g(com.amplitude.core.platform.b bVar, com.amplitude.android.h hVar, C1086c c1086c, C1101n0 c1101n0);

    Object h(com.amplitude.core.events.a aVar, ContinuationImpl continuationImpl);
}
