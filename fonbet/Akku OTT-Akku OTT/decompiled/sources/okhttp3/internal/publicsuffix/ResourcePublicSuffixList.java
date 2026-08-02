package okhttp3.internal.publicsuffix;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.AbstractC1197l;
import okio.C;
import okio.K;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/publicsuffix/ResourcePublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lokio/C;", "path", "Lokio/l;", "fileSystem", "<init>", "(Lokio/C;Lokio/l;)V", "Lokio/K;", "listSource", "()Lokio/K;", "Lokio/C;", "getPath", "()Lokio/C;", "Lokio/l;", "getFileSystem", "()Lokio/l;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResourcePublicSuffixList extends BasePublicSuffixList {

    @JvmField
    public static final C PUBLIC_SUFFIX_RESOURCE;
    private final AbstractC1197l fileSystem;
    private final C path;

    static {
        C.Companion.getClass();
        PUBLIC_SUFFIX_RESOURCE = C.a.a("okhttp3/internal/publicsuffix/PublicSuffixDatabase.list", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResourcePublicSuffixList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final AbstractC1197l getFileSystem() {
        return this.fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public K listSource() {
        return this.fileSystem.source(getPath());
    }

    public /* synthetic */ ResourcePublicSuffixList(C c, AbstractC1197l abstractC1197l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : c, (i & 2) != 0 ? AbstractC1197l.RESOURCES : abstractC1197l);
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public C getPath() {
        return this.path;
    }

    public ResourcePublicSuffixList(C path, AbstractC1197l fileSystem) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.path = path;
        this.fileSystem = fileSystem;
    }
}
