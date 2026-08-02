package org.modelmapper.internal.converter;

import androidx.credentials.provider.CredentialEntry;
import com.caverock.androidsvg.SVGParser;
import com.ironsource.B5;
import kotlinx.coroutines.DebugKt;
import org.modelmapper.internal.Errors;
import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
class BooleanConverter implements ConditionalConverter<Object, Boolean> {
    private static final String[] TRUE_STRINGS = {"true", "yes", "y", DebugKt.DEBUG_PROPERTY_VALUE_ON, "1"};
    private static final String[] FALSE_STRINGSS = {CredentialEntry.FALSE_STRING, SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO, B5.q, DebugKt.DEBUG_PROPERTY_VALUE_OFF, "0"};

    BooleanConverter() {
    }

    @Override // org.modelmapper.Converter
    public /* bridge */ /* synthetic */ Object convert(MappingContext mappingContext) {
        return convert((MappingContext<Object, Boolean>) mappingContext);
    }

    @Override // org.modelmapper.Converter
    public Boolean convert(MappingContext<Object, Boolean> mappingContext) {
        Object source = mappingContext.getSource();
        if (source == null) {
            return null;
        }
        String lowerCase = source.toString().toLowerCase();
        if (lowerCase.length() == 0) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = TRUE_STRINGS;
            if (i2 >= strArr.length) {
                while (true) {
                    String[] strArr2 = FALSE_STRINGSS;
                    if (i < strArr2.length) {
                        if (strArr2[i].equals(lowerCase)) {
                            return Boolean.FALSE;
                        }
                        i++;
                    } else {
                        throw new Errors().errorMapping(mappingContext.getSource(), mappingContext.getDestinationType()).toMappingException();
                    }
                }
            } else {
                if (strArr[i2].equals(lowerCase)) {
                    return Boolean.TRUE;
                }
                i2++;
            }
        }
    }

    @Override // org.modelmapper.spi.ConditionalConverter
    public ConditionalConverter.MatchResult match(Class<?> cls, Class<?> cls2) {
        if (cls2 == Boolean.class || cls2 == Boolean.TYPE) {
            return (cls == Boolean.class || cls == Boolean.TYPE) ? ConditionalConverter.MatchResult.FULL : ConditionalConverter.MatchResult.PARTIAL;
        }
        return ConditionalConverter.MatchResult.NONE;
    }
}
