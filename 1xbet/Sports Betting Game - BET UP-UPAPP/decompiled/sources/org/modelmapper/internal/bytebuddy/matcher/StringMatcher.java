package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class StringMatcher extends ElementMatcher.Junction.AbstractBase<String> {
    private final Mode mode;
    private final String value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StringMatcher stringMatcher = (StringMatcher) obj;
        return this.value.equals(stringMatcher.value) && this.mode.equals(stringMatcher.mode);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value.hashCode()) * 31) + this.mode.hashCode();
    }

    public StringMatcher(String str, Mode mode) {
        this.value = str;
        this.mode = mode;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(String str) {
        return this.mode.matches(this.value, str);
    }

    public String toString() {
        return this.mode.getDescription() + '(' + this.value + ')';
    }

    public enum Mode {
        EQUALS_FULLY("equals") { // from class: org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode.1
            @Override // org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode
            protected boolean matches(String str, String str2) {
                return str2.equals(str);
            }
        },
        EQUALS_FULLY_IGNORE_CASE("equalsIgnoreCase") { // from class: org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode.2
            @Override // org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode
            protected boolean matches(String str, String str2) {
                return str2.equalsIgnoreCase(str);
            }
        },
        STARTS_WITH("startsWith") { // from class: org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode.3
            @Override // org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode
            protected boolean matches(String str, String str2) {
                return str2.startsWith(str);
            }
        },
        STARTS_WITH_IGNORE_CASE("startsWithIgnoreCase") { // from class: org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode.4
            @Override // org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode
            protected boolean matches(String str, String str2) {
                return str2.toLowerCase().startsWith(str.toLowerCase());
            }
        },
        ENDS_WITH("endsWith") { // from class: org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode.5
            @Override // org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode
            protected boolean matches(String str, String str2) {
                return str2.endsWith(str);
            }
        },
        ENDS_WITH_IGNORE_CASE("endsWithIgnoreCase") { // from class: org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode.6
            @Override // org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode
            protected boolean matches(String str, String str2) {
                return str2.toLowerCase().endsWith(str.toLowerCase());
            }
        },
        CONTAINS("contains") { // from class: org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode.7
            @Override // org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode
            protected boolean matches(String str, String str2) {
                return str2.contains(str);
            }
        },
        CONTAINS_IGNORE_CASE("containsIgnoreCase") { // from class: org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode.8
            @Override // org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode
            protected boolean matches(String str, String str2) {
                return str2.toLowerCase().contains(str.toLowerCase());
            }
        },
        MATCHES("matches") { // from class: org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode.9
            @Override // org.modelmapper.internal.bytebuddy.matcher.StringMatcher.Mode
            protected boolean matches(String str, String str2) {
                return str2.matches(str);
            }
        };

        private final String description;

        protected abstract boolean matches(String str, String str2);

        Mode(String str) {
            this.description = str;
        }

        protected String getDescription() {
            return this.description;
        }
    }
}
