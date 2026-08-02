package p000;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l82 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f4712a = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* JADX INFO: renamed from: b */
    public static final Account f4713b = h82.f3126a;

    /* JADX INFO: renamed from: c */
    public static final Set f4714c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));

    /* JADX INFO: renamed from: d */
    public static final Set f4715d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}
