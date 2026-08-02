package Vb0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c NETWORK_ERROR;
    public static final c NOT_FOUND;
    public static final c RENDER_ERROR;
    public static final c START_ERROR;

    @NotNull
    private final String value;

    static {
        c cVar = new c("NOT_FOUND", 0, "webview_not_found_error_android");
        NOT_FOUND = cVar;
        c cVar2 = new c("START_ERROR", 1, "webview_start_error_android");
        START_ERROR = cVar2;
        c cVar3 = new c("NETWORK_ERROR", 2, "webview_network_error");
        NETWORK_ERROR = cVar3;
        c cVar4 = new c("RENDER_ERROR", 3, "webview_render_error");
        RENDER_ERROR = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = Xc.b.a(cVarArr);
    }

    private c(String str, int i11, String str2) {
        this.value = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.value;
    }
}
