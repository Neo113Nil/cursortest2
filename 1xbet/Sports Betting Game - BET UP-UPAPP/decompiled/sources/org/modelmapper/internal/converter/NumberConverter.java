package org.modelmapper.internal.converter;

import androidx.collection.SieveCacheKt;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;
import org.modelmapper.internal.Errors;
import org.modelmapper.internal.util.Primitives;
import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
class NumberConverter implements ConditionalConverter<Object, Number> {
    NumberConverter() {
    }

    @Override // org.modelmapper.Converter
    public /* bridge */ /* synthetic */ Object convert(MappingContext mappingContext) {
        return convert((MappingContext<Object, Number>) mappingContext);
    }

    @Override // org.modelmapper.Converter
    public Number convert(MappingContext<Object, Number> mappingContext) {
        Object source = mappingContext.getSource();
        if (source == null) {
            return null;
        }
        Class<?> wrapperFor = Primitives.wrapperFor(mappingContext.getDestinationType());
        if (source instanceof Number) {
            return numberFor((Number) source, wrapperFor);
        }
        if (source instanceof Boolean) {
            return numberFor(Integer.valueOf(((Boolean) source).booleanValue() ? 1 : 0), wrapperFor);
        }
        if ((source instanceof Date) && Long.class.equals(wrapperFor)) {
            return Long.valueOf(((Date) source).getTime());
        }
        if ((source instanceof Calendar) && Long.class.equals(wrapperFor)) {
            return Long.valueOf(((Calendar) source).getTime().getTime());
        }
        if ((source instanceof XMLGregorianCalendar) && Long.class.equals(wrapperFor)) {
            return Long.valueOf(((XMLGregorianCalendar) source).toGregorianCalendar().getTimeInMillis());
        }
        return numberFor(source.toString(), wrapperFor);
    }

    @Override // org.modelmapper.spi.ConditionalConverter
    public ConditionalConverter.MatchResult match(Class<?> cls, Class<?> cls2) {
        if (Number.class.isAssignableFrom(Primitives.wrapperFor(cls2))) {
            return (Number.class.isAssignableFrom(Primitives.wrapperFor(cls)) || cls == Boolean.class || cls == Boolean.TYPE || cls == String.class || Date.class.isAssignableFrom(cls) || Calendar.class.isAssignableFrom(cls) || XMLGregorianCalendar.class.isAssignableFrom(cls)) ? ConditionalConverter.MatchResult.FULL : ConditionalConverter.MatchResult.PARTIAL;
        }
        return ConditionalConverter.MatchResult.NONE;
    }

    Number numberFor(Number number, Class<?> cls) {
        if (cls.equals(number.getClass())) {
            return number;
        }
        if (cls.equals(Byte.class)) {
            long longValue = number.longValue();
            if (longValue > 127) {
                throw new Errors().errorTooLarge(number, cls).toMappingException();
            }
            if (longValue < -128) {
                throw new Errors().errorTooSmall(number, cls).toMappingException();
            }
            return Byte.valueOf(number.byteValue());
        }
        if (cls.equals(Short.class)) {
            long longValue2 = number.longValue();
            if (longValue2 > 32767) {
                throw new Errors().errorTooLarge(number, cls).toMappingException();
            }
            if (longValue2 < -32768) {
                throw new Errors().errorTooSmall(number, cls).toMappingException();
            }
            return Short.valueOf(number.shortValue());
        }
        if (cls.equals(Integer.class)) {
            long longValue3 = number.longValue();
            if (longValue3 > SieveCacheKt.NodeLinkMask) {
                throw new Errors().errorTooLarge(number, cls).toMappingException();
            }
            if (longValue3 < SieveCacheKt.NodeMetaAndPreviousMask) {
                throw new Errors().errorTooSmall(number, cls).toMappingException();
            }
            return Integer.valueOf(number.intValue());
        }
        if (cls.equals(Long.class)) {
            return Long.valueOf(number.longValue());
        }
        if (cls.equals(Float.class)) {
            if (number.doubleValue() > 3.4028234663852886E38d) {
                throw new Errors().errorTooLarge(number, cls).toMappingException();
            }
            return Float.valueOf(number.floatValue());
        }
        if (cls.equals(Double.class)) {
            return Double.valueOf(number.doubleValue());
        }
        if (cls.equals(BigDecimal.class)) {
            if ((number instanceof Float) || (number instanceof Double)) {
                return new BigDecimal(number.toString());
            }
            if (number instanceof BigInteger) {
                return new BigDecimal((BigInteger) number);
            }
            return BigDecimal.valueOf(number.longValue());
        }
        if (cls.equals(BigInteger.class)) {
            if (number instanceof BigDecimal) {
                return ((BigDecimal) number).toBigInteger();
            }
            return BigInteger.valueOf(number.longValue());
        }
        throw new Errors().errorMapping(number, cls).toMappingException();
    }

    Number numberFor(String str, Class<?> cls) {
        if (str.trim().length() == 0) {
            return null;
        }
        try {
            if (cls.equals(Byte.class)) {
                return Byte.valueOf(str);
            }
            if (cls.equals(Short.class)) {
                return Short.valueOf(str);
            }
            if (cls.equals(Integer.class)) {
                return Integer.valueOf(str);
            }
            if (cls.equals(Long.class)) {
                return Long.valueOf(str);
            }
            if (cls.equals(Float.class)) {
                return Float.valueOf(str);
            }
            if (cls.equals(Double.class)) {
                return Double.valueOf(str);
            }
            if (cls.equals(BigDecimal.class)) {
                return new BigDecimal(str);
            }
            if (cls.equals(BigInteger.class)) {
                return new BigInteger(str);
            }
            throw new Errors().errorMapping(str, cls).toMappingException();
        } catch (Exception e) {
            throw new Errors().errorMapping(str, cls, e).toMappingException();
        }
    }
}
