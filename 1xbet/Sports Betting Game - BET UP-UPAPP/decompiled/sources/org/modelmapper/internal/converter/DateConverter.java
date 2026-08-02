package org.modelmapper.internal.converter;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;
import org.modelmapper.internal.Errors;
import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
class DateConverter implements ConditionalConverter<Object, Date> {
    DateConverter() {
    }

    @Override // org.modelmapper.Converter
    public /* bridge */ /* synthetic */ Object convert(MappingContext mappingContext) {
        return convert((MappingContext<Object, Date>) mappingContext);
    }

    @Override // org.modelmapper.Converter
    public Date convert(MappingContext<Object, Date> mappingContext) {
        Object source = mappingContext.getSource();
        if (source == null) {
            return null;
        }
        Class<Date> destinationType = mappingContext.getDestinationType();
        if (source instanceof Date) {
            return dateFor(((Date) source).getTime(), destinationType);
        }
        if (source instanceof Calendar) {
            return dateFor(((Calendar) source).getTimeInMillis(), destinationType);
        }
        if (source instanceof XMLGregorianCalendar) {
            return dateFor(((XMLGregorianCalendar) source).toGregorianCalendar().getTimeInMillis(), destinationType);
        }
        if (source instanceof Long) {
            return dateFor(((Long) source).longValue(), destinationType);
        }
        return dateFor(source.toString(), mappingContext.getDestinationType());
    }

    @Override // org.modelmapper.spi.ConditionalConverter
    public ConditionalConverter.MatchResult match(Class<?> cls, Class<?> cls2) {
        return (Date.class.isAssignableFrom(cls2) && (Date.class.isAssignableFrom(cls) || Calendar.class.isAssignableFrom(cls) || cls == XMLGregorianCalendar.class || cls == Long.class || cls == Long.TYPE || cls == String.class)) ? ConditionalConverter.MatchResult.FULL : ConditionalConverter.MatchResult.NONE;
    }

    Date dateFor(long j, Class<?> cls) {
        if (cls.equals(Date.class)) {
            return new Date(j);
        }
        if (cls.equals(java.sql.Date.class)) {
            return new java.sql.Date(j);
        }
        if (cls.equals(Time.class)) {
            return new Time(j);
        }
        if (cls.equals(Timestamp.class)) {
            return new Timestamp(j);
        }
        throw new Errors().errorMapping(Long.valueOf(j), cls).toMappingException();
    }

    Date dateFor(String str, Class<?> cls) {
        if (toString().trim().length() == 0) {
            throw new Errors().errorMapping(str, cls).toMappingException();
        }
        if (cls.equals(java.sql.Date.class)) {
            try {
                return java.sql.Date.valueOf(str);
            } catch (IllegalArgumentException unused) {
                throw new Errors().addMessage("String must be in JDBC format [yyyy-MM-dd] to create a java.sql.Date", new Object[0]).toMappingException();
            }
        }
        if (cls.equals(Time.class)) {
            try {
                return Time.valueOf(str);
            } catch (IllegalArgumentException unused2) {
                throw new Errors().addMessage("String must be in JDBC format [HH:mm:ss] to create a java.sql.Time", new Object[0]).toMappingException();
            }
        }
        if (cls.equals(Timestamp.class)) {
            try {
                return Timestamp.valueOf(str);
            } catch (IllegalArgumentException unused3) {
                throw new Errors().addMessage("String must be in JDBC format [yyyy-MM-dd HH:mm:ss.fffffffff] to create a java.sql.Timestamp", new Object[0]).toMappingException();
            }
        }
        throw new Errors().errorMapping(str, cls).toMappingException();
    }
}
