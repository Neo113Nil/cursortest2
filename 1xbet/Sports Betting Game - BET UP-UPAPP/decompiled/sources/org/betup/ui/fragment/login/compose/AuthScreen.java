package org.betup.ui.fragment.login.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AuthContent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lorg/betup/ui/fragment/login/compose/AuthScreen;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "GuestEntry", "SignInOptions", "Login", "SignUpOptions", "Registration", "Lorg/betup/ui/fragment/login/compose/AuthScreen$GuestEntry;", "Lorg/betup/ui/fragment/login/compose/AuthScreen$Login;", "Lorg/betup/ui/fragment/login/compose/AuthScreen$Registration;", "Lorg/betup/ui/fragment/login/compose/AuthScreen$SignInOptions;", "Lorg/betup/ui/fragment/login/compose/AuthScreen$SignUpOptions;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AuthScreen {
    public static final int $stable = 0;

    public /* synthetic */ AuthScreen(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AuthContent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/login/compose/AuthScreen$GuestEntry;", "Lorg/betup/ui/fragment/login/compose/AuthScreen;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GuestEntry extends AuthScreen {
        public static final int $stable = 0;
        public static final GuestEntry INSTANCE = new GuestEntry();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GuestEntry)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 527173187;
        }

        public String toString() {
            return "GuestEntry";
        }

        private GuestEntry() {
            super(null);
        }
    }

    private AuthScreen() {
    }

    /* compiled from: AuthContent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/login/compose/AuthScreen$SignInOptions;", "Lorg/betup/ui/fragment/login/compose/AuthScreen;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SignInOptions extends AuthScreen {
        public static final int $stable = 0;
        public static final SignInOptions INSTANCE = new SignInOptions();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignInOptions)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 520814355;
        }

        public String toString() {
            return "SignInOptions";
        }

        private SignInOptions() {
            super(null);
        }
    }

    /* compiled from: AuthContent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/login/compose/AuthScreen$Login;", "Lorg/betup/ui/fragment/login/compose/AuthScreen;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Login extends AuthScreen {
        public static final int $stable = 0;
        public static final Login INSTANCE = new Login();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Login)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -146464512;
        }

        public String toString() {
            return "Login";
        }

        private Login() {
            super(null);
        }
    }

    /* compiled from: AuthContent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/login/compose/AuthScreen$SignUpOptions;", "Lorg/betup/ui/fragment/login/compose/AuthScreen;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SignUpOptions extends AuthScreen {
        public static final int $stable = 0;
        public static final SignUpOptions INSTANCE = new SignUpOptions();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignUpOptions)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -503149347;
        }

        public String toString() {
            return "SignUpOptions";
        }

        private SignUpOptions() {
            super(null);
        }
    }

    /* compiled from: AuthContent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/login/compose/AuthScreen$Registration;", "Lorg/betup/ui/fragment/login/compose/AuthScreen;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Registration extends AuthScreen {
        public static final int $stable = 0;
        public static final Registration INSTANCE = new Registration();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Registration)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1827475266;
        }

        public String toString() {
            return "Registration";
        }

        private Registration() {
            super(null);
        }
    }
}
