package com.facebook.appevents;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w {
    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;
    public static final /* synthetic */ w[] e;

    static {
        w wVar = new w("EXPLICIT", 0);
        a = wVar;
        w wVar2 = new w("TIMER", 1);
        b = wVar2;
        w wVar3 = new w("SESSION_CHANGE", 2);
        w wVar4 = new w("PERSISTED_EVENTS", 3);
        w wVar5 = new w("EVENT_THRESHOLD", 4);
        c = wVar5;
        w wVar6 = new w("EAGER_FLUSHING_EVENT", 5);
        d = wVar6;
        e = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6};
    }

    public w() {
        throw null;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) e.clone();
    }
}
