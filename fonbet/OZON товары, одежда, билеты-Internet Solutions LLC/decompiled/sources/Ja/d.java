package Ja;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public enum d {
    GET("GET"),
    HEAD("HEAD"),
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH"),
    DELETE("DELETE"),
    CONNECT("CONNECT"),
    OPTIONS("OPTIONS"),
    TRACE("TRACE");


    @NotNull
    public static final a Companion;

    @NotNull
    private static final HashMap<String, d> methodMap;

    @NotNull
    private final String methodName;

    public static final class a {
    }

    static {
        d dVar = GET;
        d dVar2 = HEAD;
        d dVar3 = POST;
        d dVar4 = PUT;
        d dVar5 = PATCH;
        d dVar6 = DELETE;
        d dVar7 = CONNECT;
        d dVar8 = OPTIONS;
        d dVar9 = TRACE;
        Companion = new a();
        HashMap<String, d> hashMap = new HashMap<>();
        hashMap.put(dVar.methodName, dVar);
        hashMap.put(dVar2.methodName, dVar2);
        hashMap.put(dVar3.methodName, dVar3);
        hashMap.put(dVar4.methodName, dVar4);
        hashMap.put(dVar6.methodName, dVar6);
        hashMap.put(dVar7.methodName, dVar7);
        hashMap.put(dVar8.methodName, dVar8);
        hashMap.put(dVar9.methodName, dVar9);
        hashMap.put(dVar5.methodName, dVar5);
        methodMap = hashMap;
    }

    d(String str) {
        this.methodName = str;
    }

    @NotNull
    public final String b() {
        return this.methodName;
    }
}
