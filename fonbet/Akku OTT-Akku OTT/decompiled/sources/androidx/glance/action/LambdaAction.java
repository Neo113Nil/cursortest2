package androidx.glance.action;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/glance/action/LambdaAction;", "Landroidx/glance/action/Action;", Constants.KEY, "", "block", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getBlock", "()Lkotlin/jvm/functions/Function0;", "getKey", "()Ljava/lang/String;", "toString", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class LambdaAction implements Action {
    public static final int $stable = 0;
    private final Function0<Unit> block;
    private final String key;

    public LambdaAction(String str, Function0<Unit> function0) {
        this.key = str;
        this.block = function0;
    }

    public final Function0<Unit> getBlock() {
        return this.block;
    }

    public final String getKey() {
        return this.key;
    }

    public String toString() {
        return "LambdaAction(" + this.key + ", " + this.block.hashCode() + ')';
    }
}
