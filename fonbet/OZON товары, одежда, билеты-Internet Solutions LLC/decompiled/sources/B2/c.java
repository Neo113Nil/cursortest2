package B2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes8.dex */
public final class c {

    final class a extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f2186a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, b bVar) {
            super(inputConnection, false);
            this.f2186a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
            if (this.f2186a.d(d.f(inputContentInfo), i11, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i11, bundle);
        }
    }

    public interface b {
        boolean d(@NonNull d dVar, int i11, Bundle bundle);
    }

    @NonNull
    @Deprecated
    public static InputConnection a(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull b bVar) {
        if (editorInfo != null) {
            return new a(inputConnection, bVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }

    @NonNull
    public static InputConnection b(@NonNull AppCompatEditText appCompatEditText, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return a(inputConnection, editorInfo, new B2.b(appCompatEditText));
    }
}
