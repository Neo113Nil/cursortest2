package io.ktor.http.cio;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.common.net.HttpHeaders;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import io.ktor.http.cio.ConnectionOptions;
import io.ktor.http.cio.internals.AsciiCharTree;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConnectionOptions.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/ktor/http/cio/ConnectionOptions;", "", "", "close", "keepAlive", "upgrade", "", "", "extraOptions", "<init>", "(ZZZLjava/util/List;)V", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "buildToString", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "getClose", "()Z", "getKeepAlive", "getUpgrade", "Ljava/util/List;", "getExtraOptions", "()Ljava/util/List;", k.M, "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConnectionOptions {
    private static final ConnectionOptions Close;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConnectionOptions KeepAlive;
    private static final ConnectionOptions Upgrade;
    private static final AsciiCharTree<Pair<String, ConnectionOptions>> knownTypes;
    private final boolean close;
    private final List<String> extraOptions;
    private final boolean keepAlive;
    private final boolean upgrade;

    public ConnectionOptions() {
        this(false, false, false, null, 15, null);
    }

    public ConnectionOptions(boolean z, boolean z2, boolean z3, List<String> extraOptions) {
        Intrinsics.checkNotNullParameter(extraOptions, "extraOptions");
        this.close = z;
        this.keepAlive = z2;
        this.upgrade = z3;
        this.extraOptions = extraOptions;
    }

    public final boolean getClose() {
        return this.close;
    }

    public final boolean getKeepAlive() {
        return this.keepAlive;
    }

    public final boolean getUpgrade() {
        return this.upgrade;
    }

    public /* synthetic */ ConnectionOptions(boolean z, boolean z2, boolean z3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<String> getExtraOptions() {
        return this.extraOptions;
    }

    /* compiled from: ConnectionOptions.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/http/cio/ConnectionOptions$Companion;", "", "<init>", "()V", "", "connection", "Lio/ktor/http/cio/ConnectionOptions;", "parse", "(Ljava/lang/CharSequence;)Lio/ktor/http/cio/ConnectionOptions;", "parseSlow", "Close", "Lio/ktor/http/cio/ConnectionOptions;", "getClose", "()Lio/ktor/http/cio/ConnectionOptions;", "KeepAlive", "getKeepAlive", HttpHeaders.UPGRADE, "getUpgrade", "Lio/ktor/http/cio/internals/AsciiCharTree;", "Lkotlin/Pair;", "", "knownTypes", "Lio/ktor/http/cio/internals/AsciiCharTree;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean parse$lambda$0(char c, int i) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean parseSlow$lambda$1(char c, int i) {
            return false;
        }

        private Companion() {
        }

        public final ConnectionOptions getClose() {
            return ConnectionOptions.Close;
        }

        public final ConnectionOptions getKeepAlive() {
            return ConnectionOptions.KeepAlive;
        }

        public final ConnectionOptions getUpgrade() {
            return ConnectionOptions.Upgrade;
        }

        public final ConnectionOptions parse(CharSequence connection) {
            if (connection == null) {
                return null;
            }
            List search$default = AsciiCharTree.search$default(ConnectionOptions.knownTypes, connection, 0, 0, true, new Function2() { // from class: io.ktor.http.cio.ConnectionOptions$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean parse$lambda$0;
                    parse$lambda$0 = ConnectionOptions.Companion.parse$lambda$0(((Character) obj).charValue(), ((Integer) obj2).intValue());
                    return Boolean.valueOf(parse$lambda$0);
                }
            }, 6, null);
            return search$default.size() == 1 ? (ConnectionOptions) ((Pair) search$default.get(0)).getSecond() : parseSlow(connection);
        }

        private final ConnectionOptions parseSlow(CharSequence connection) {
            int i;
            int i2;
            int length = connection.length();
            ConnectionOptions connectionOptions = null;
            ArrayList arrayList = null;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                while (true) {
                    char charAt = connection.charAt(i3);
                    if (charAt != ' ' && charAt != ',') {
                        i = i3;
                        i2 = i;
                        break;
                    }
                    i3++;
                    if (i3 >= length) {
                        i = i3;
                        i2 = i4;
                        break;
                    }
                }
                while (i < length) {
                    char charAt2 = connection.charAt(i);
                    if (charAt2 == ' ' || charAt2 == ',') {
                        break;
                    }
                    i++;
                }
                Pair pair = (Pair) CollectionsKt.singleOrNull(ConnectionOptions.knownTypes.search(connection, i2, i, true, new Function2() { // from class: io.ktor.http.cio.ConnectionOptions$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        boolean parseSlow$lambda$1;
                        parseSlow$lambda$1 = ConnectionOptions.Companion.parseSlow$lambda$1(((Character) obj).charValue(), ((Integer) obj2).intValue());
                        return Boolean.valueOf(parseSlow$lambda$1);
                    }
                }));
                if (pair == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(connection.subSequence(i2, i).toString());
                } else if (connectionOptions == null) {
                    connectionOptions = (ConnectionOptions) pair.getSecond();
                } else {
                    boolean z = true;
                    boolean z2 = connectionOptions.getClose() || ((ConnectionOptions) pair.getSecond()).getClose();
                    boolean z3 = connectionOptions.getKeepAlive() || ((ConnectionOptions) pair.getSecond()).getKeepAlive();
                    if (!connectionOptions.getUpgrade() && !((ConnectionOptions) pair.getSecond()).getUpgrade()) {
                        z = false;
                    }
                    connectionOptions = new ConnectionOptions(z2, z3, z, CollectionsKt.emptyList());
                }
                i3 = i;
                i4 = i2;
            }
            if (connectionOptions == null) {
                connectionOptions = getKeepAlive();
            }
            return arrayList == null ? connectionOptions : new ConnectionOptions(connectionOptions.getClose(), connectionOptions.getKeepAlive(), connectionOptions.getUpgrade(), arrayList);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        List list = null;
        ConnectionOptions connectionOptions = new ConnectionOptions(true, z, false, list, 14, defaultConstructorMarker);
        Close = connectionOptions;
        ConnectionOptions connectionOptions2 = new ConnectionOptions(false, true, false, null, 13, null);
        KeepAlive = connectionOptions2;
        ConnectionOptions connectionOptions3 = new ConnectionOptions(false, z, true, list, 11, defaultConstructorMarker);
        Upgrade = connectionOptions3;
        knownTypes = AsciiCharTree.INSTANCE.build(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("close", connectionOptions), TuplesKt.to("keep-alive", connectionOptions2), TuplesKt.to("upgrade", connectionOptions3)}), new Function1() { // from class: io.ktor.http.cio.ConnectionOptions$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int knownTypes$lambda$1;
                knownTypes$lambda$1 = ConnectionOptions.knownTypes$lambda$1((Pair) obj);
                return Integer.valueOf(knownTypes$lambda$1);
            }
        }, new Function2() { // from class: io.ktor.http.cio.ConnectionOptions$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                char knownTypes$lambda$2;
                knownTypes$lambda$2 = ConnectionOptions.knownTypes$lambda$2((Pair) obj, ((Integer) obj2).intValue());
                return Character.valueOf(knownTypes$lambda$2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int knownTypes$lambda$1(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((String) it.getFirst()).length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char knownTypes$lambda$2(Pair t, int i) {
        Intrinsics.checkNotNullParameter(t, "t");
        return ((String) t.getFirst()).charAt(i);
    }

    public String toString() {
        if (this.extraOptions.isEmpty()) {
            boolean z = this.close;
            return (!z || this.keepAlive || this.upgrade) ? (z || !this.keepAlive || this.upgrade) ? (!z && this.keepAlive && this.upgrade) ? "keep-alive, Upgrade" : buildToString() : "keep-alive" : "close";
        }
        return buildToString();
    }

    private final String buildToString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(this.extraOptions.size() + 3);
        if (this.close) {
            arrayList.add("close");
        }
        if (this.keepAlive) {
            arrayList.add("keep-alive");
        }
        if (this.upgrade) {
            arrayList.add(HttpHeaders.UPGRADE);
        }
        if (!this.extraOptions.isEmpty()) {
            arrayList.addAll(this.extraOptions);
        }
        CollectionsKt.joinTo(arrayList, sb, (r14 & 2) != 0 ? ", " : null, (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        return sb.toString();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        ConnectionOptions connectionOptions = (ConnectionOptions) other;
        return this.close == connectionOptions.close && this.keepAlive == connectionOptions.keepAlive && this.upgrade == connectionOptions.upgrade && Intrinsics.areEqual(this.extraOptions, connectionOptions.extraOptions);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.close) * 31) + Boolean.hashCode(this.keepAlive)) * 31) + Boolean.hashCode(this.upgrade)) * 31) + this.extraOptions.hashCode();
    }
}
