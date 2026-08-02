package org.modelmapper.spi;

import java.io.Serializable;
import org.modelmapper.internal.util.Assert;

/* loaded from: classes4.dex */
public final class ErrorMessage implements Serializable {
    private static final long serialVersionUID = 0;
    private final Throwable cause;
    private final String message;

    public ErrorMessage(String str) {
        this(str, null);
    }

    public ErrorMessage(String str, Throwable th) {
        this.message = (String) Assert.notNull(str, "message");
        this.cause = th;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErrorMessage)) {
            return false;
        }
        ErrorMessage errorMessage = (ErrorMessage) obj;
        return this.message.equals(errorMessage.message) && this.cause.equals(errorMessage.cause);
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        return this.message;
    }
}
