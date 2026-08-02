package org.modelmapper.internal.converter;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.modelmapper.internal.Errors;
import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
class CalendarConverter implements ConditionalConverter<Object, Object> {
    private static DatatypeFactory dataTypeFactory;

    CalendarConverter() {
    }

    private static DatatypeFactory getDataTypeFactory() {
        if (dataTypeFactory == null) {
            try {
                dataTypeFactory = DatatypeFactory.newInstance();
            } catch (DatatypeConfigurationException e) {
                throw new Errors().addMessage(e, "Failed to create DataTypeFactory required for XMLGregorianCalendar conversion", new Object[0]).toMappingException();
            }
        }
        return dataTypeFactory;
    }

    @Override // org.modelmapper.Converter
    public Object convert(MappingContext<Object, Object> mappingContext) {
        Object source = mappingContext.getSource();
        if (source == null) {
            return null;
        }
        Class<?> destinationType = mappingContext.getDestinationType();
        if (!Calendar.class.isAssignableFrom(destinationType) && !destinationType.equals(XMLGregorianCalendar.class)) {
            throw new Errors().errorMapping(source, destinationType).toMappingException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (source instanceof Date) {
            gregorianCalendar.setTimeInMillis(((Date) source).getTime());
        } else if (source instanceof Calendar) {
            Calendar calendar = (Calendar) source;
            gregorianCalendar.setTimeZone(calendar.getTimeZone());
            gregorianCalendar.setTimeInMillis(calendar.getTime().getTime());
        } else if (source instanceof XMLGregorianCalendar) {
            GregorianCalendar gregorianCalendar2 = ((XMLGregorianCalendar) source).toGregorianCalendar();
            gregorianCalendar.setTimeZone(gregorianCalendar2.getTimeZone());
            gregorianCalendar.setTimeInMillis(gregorianCalendar2.getTime().getTime());
        } else if (source instanceof Long) {
            gregorianCalendar.setTimeInMillis(((Long) source).longValue());
        }
        return destinationType.equals(XMLGregorianCalendar.class) ? getDataTypeFactory().newXMLGregorianCalendar(gregorianCalendar) : gregorianCalendar;
    }

    @Override // org.modelmapper.spi.ConditionalConverter
    public ConditionalConverter.MatchResult match(Class<?> cls, Class<?> cls2) {
        return ((Calendar.class.isAssignableFrom(cls2) || cls2 == XMLGregorianCalendar.class) && (Date.class.isAssignableFrom(cls) || Calendar.class.isAssignableFrom(cls) || cls == XMLGregorianCalendar.class || cls == Long.class || cls == Long.TYPE)) ? ConditionalConverter.MatchResult.FULL : ConditionalConverter.MatchResult.NONE;
    }
}
