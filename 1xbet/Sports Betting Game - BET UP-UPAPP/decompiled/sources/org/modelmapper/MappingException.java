package org.modelmapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.modelmapper.internal.Errors;
import org.modelmapper.spi.ErrorMessage;

/* loaded from: classes4.dex */
public class MappingException extends RuntimeException {
    private static final long serialVersionUID = 0;
    private final List<ErrorMessage> messages;

    public MappingException(List<ErrorMessage> list) {
        ArrayList arrayList = new ArrayList(list);
        this.messages = arrayList;
        initCause(Errors.getOnlyCause(arrayList));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return Errors.format("ModelMapper mapping errors", this.messages);
    }

    public Collection<ErrorMessage> getErrorMessages() {
        return this.messages;
    }
}
