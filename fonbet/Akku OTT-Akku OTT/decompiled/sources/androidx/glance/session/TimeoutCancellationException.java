package androidx.glance.session;

import androidx.collection.i;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/glance/session/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", Constants.MESSAGE, "", "block", "", "(Ljava/lang/String;I)V", "getBlock$glance_release", "()I", "getMessage", "()Ljava/lang/String;", "fillInStackTrace", "toString", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimeoutCancellationException extends CancellationException {
    private final int block;
    private final String message;

    public TimeoutCancellationException(String str, int i) {
        super(str);
        this.message = str;
        this.block = i;
    }

    @Override // java.lang.Throwable
    public TimeoutCancellationException fillInStackTrace() {
        return this;
    }

    /* renamed from: getBlock$glance_release, reason: from getter */
    public final int getBlock() {
        return this.block;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("TimeoutCancellationException(");
        sb.append(getMessage());
        sb.append(", ");
        return i.c(sb, this.block, ')');
    }
}
